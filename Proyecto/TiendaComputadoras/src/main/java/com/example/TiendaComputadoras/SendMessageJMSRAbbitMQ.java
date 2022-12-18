package com.example.TiendaComputadoras;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.TiendaComputadoras.model.Email;
@Slf4j
@Component
public class SendMessageJMSRAbbitMQ implements CommandLineRunner {
    @Value("${hsbc.exchange}")
    private String TOPIC_EXCHANGE_NAME;

    @Value("${hsbc.routing}")
    private String ROUTING_KEY;

    private RabbitTemplate template;

    @Autowired
    public SendMessageJMSRAbbitMQ(RabbitTemplate template) {
        this.template = template;
    }

    @Override
    public void run(String[] args) {
        log.info("Enviando mensaje...");
        template.convertAndSend(TOPIC_EXCHANGE_NAME, ROUTING_KEY,
                new Email("Correo de prueba", "spiderman@gmail.com", "robbin@gmail.com", "Correo de prueba para envio de datos a facturar"));
    }
}
