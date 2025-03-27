package co.pragma.scaffold.infra.driver.amqp.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductMessageDto {

    private String name;

    private BigDecimal price;
}
