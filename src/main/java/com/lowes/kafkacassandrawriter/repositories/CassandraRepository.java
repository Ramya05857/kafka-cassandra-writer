package com.lowes.kafkacassandrawriter.repositories;

import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CassandraRepository {

    @Autowired
    private Session session;

    public void saveEvent(String kafkaMessage) {
        session.execute("INSERT INTO EVENT(UUID, MESSAGE) VALUES(?, ?)", UUID.randomUUID(),
                kafkaMessage);
    }
}
