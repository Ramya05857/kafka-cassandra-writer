package com.lowes.kafkacassandrawriter.service;

import com.lowes.kafkacassandrawriter.repositories.CassandraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CassandraWriterService {

    @Autowired
    private CassandraRepository cassandraRepository;

    public void saveKafkaEvent(String kafkaMessage) {
        cassandraRepository.saveEvent(kafkaMessage);
        log.info("Message saved:: " + kafkaMessage);
    }
}
