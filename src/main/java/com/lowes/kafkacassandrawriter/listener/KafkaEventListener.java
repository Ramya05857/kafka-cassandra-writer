package com.lowes.kafkacassandrawriter.listener;

import com.lowes.kafkacassandrawriter.service.CassandraWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventListener {

    @Autowired
    private CassandraWriterService cassandraWriterService;

    @KafkaListener(topics = "Example_Topic", groupId = "group_id")
    public void consume(String message) { cassandraWriterService.saveKafkaEvent(message);}
}
