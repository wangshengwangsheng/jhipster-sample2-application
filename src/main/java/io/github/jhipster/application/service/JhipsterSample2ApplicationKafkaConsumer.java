package io.github.jhipster.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JhipsterSample2ApplicationKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(JhipsterSample2ApplicationKafkaConsumer.class);
    private static final String TOPIC = "topic_jhipstersample2application";

    @KafkaListener(topics = "topic_jhipstersample2application", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
