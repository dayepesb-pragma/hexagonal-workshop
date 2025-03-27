# Scaffold SkillNet Java Devops Clean AArchitecture

## Instalación y configuración de la base de datos
1. Instala Docker en tu sistema. (Recomiendo Docker Rancher)
2. Descarga la imagen de postgres
   ``` bash
   docker pull postgres
   ```
3. Ejecuta el contenedor de PostgreSQL:
   ```bash
   docker run -d --name skillnet-postgres -p 5432:5432 -e POSTGRES_PASSWORD=root postgres
   ```
4. Ingresa al contenedor:
   ```bash
   docker exec -it skillnet-postgres psql -U postgres
   ```
5. Crea el usuario en la base de datos
```sql
 CREATE USER skillnettest WITH PASSWORD 'root';
```
6. Dentro de psql, crea el esquema y el usuario:
   ```sql
   CREATE DATABASE skillnetworkshop;
   GRANT ALL PRIVILEGES ON DATABASE skillnetworkshop TO skillnettest;
   ```
7. Te recomiendo crear un nuevo schema, distinto al public
   ```sql
   CREATE SCHEMA skillnet_test;
   GRANT ALL PRIVILEGES ON SCHEMA skillnet_test TO skillnettest; 
   ```
8. Ahora crea la tabla requerida para este proyecto

   ```sql
   -- skillnet_test.car definition
   
   -- Drop table
   
   -- DROP TABLE skillnet_test.car;
   
   CREATE TABLE skillnet_test.car (
       kms int4 NULL,
       "year" int4 NULL,
       id int8 NOT NULL,
       brand varchar(255) NULL,
       image_url varchar(255) NULL,
       model varchar(255) NULL,
       public_name varchar(255) NULL,
       state varchar(255) NULL,
       CONSTRAINT car_pkey PRIMARY KEY (id)
   );
   ```
   
9. Ejecuta el proyecto y prueba con postman los endpoints