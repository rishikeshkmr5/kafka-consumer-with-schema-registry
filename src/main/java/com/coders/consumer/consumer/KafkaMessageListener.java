package com.coders.consumer.consumer;

import com.coders.avro.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

   /* @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume(String message) {
        logger.info("Consumer 1 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume2(String message) {
        logger.info("Consumer 2 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume3(String message) {
        logger.info("Consumer 3 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume4(String message) {
        logger.info("Consumer 4 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume5(String message) {
        logger.info("Consumer 5 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-5", groupId = "rishi-group-id-2")
    public void consume6(String message) {
        logger.info("Consumer 6 consumed the message: {}", message);
    }

    @KafkaListener(topics = "rishi-topic-7", groupId = "rishi-group-id")
    public void consume6(Customer customer) {
        logger.info("Consumer 6 consumed the message: {}", customer);
    }
    */

    @KafkaListener(topics = "rishi-topic-8", groupId = "rishi-group-id")
    public void consume8(User user) {
        logger.info("Consumer 8 consumed the message: {}", user);
    }
}
