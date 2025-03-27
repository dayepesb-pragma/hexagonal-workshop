package co.pragma.scaffold.infra.driver.amqp.adapters;

import co.pragma.scaffold.infra.driver.amqp.dto.ProductMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductAmqpAdapter {

    @RabbitListener(queues = "${product.queue.name}")
    public void reciverMessage(ProductMessageDto product) throws InterruptedException {
        log.info("Data: {}", product);
        Thread.sleep(5000);
    }
}
