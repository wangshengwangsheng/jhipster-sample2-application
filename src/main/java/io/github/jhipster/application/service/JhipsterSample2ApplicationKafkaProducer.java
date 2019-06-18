package io.github.jhipster.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JhipsterSample2ApplicationKafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(JhipsterSample2ApplicationKafkaProducer.class);
    private static final String TOPIC = "topic_jhipstersample2application";

    private KafkaTemplate<String, String> kafkaTemplate;

    public JhipsterSample2ApplicationKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info("Producing message to {} : {}", TOPIC, message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}
