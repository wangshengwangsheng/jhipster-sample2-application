package io.github.jhipster.application.web.rest;

import io.github.jhipster.application.service.JhipsterSample2ApplicationKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/jhipster-sample-2-application-kafka")
public class JhipsterSample2ApplicationKafkaResource {

    private final Logger log = LoggerFactory.getLogger(JhipsterSample2ApplicationKafkaResource.class);

    private JhipsterSample2ApplicationKafkaProducer kafkaProducer;

    public JhipsterSample2ApplicationKafkaResource(JhipsterSample2ApplicationKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
