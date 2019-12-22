package com.lowes.kafkacassandrawriter.configuration;

import com.datastax.driver.core.Session;
import com.datastax.driver.core.Cluster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class CassandraConfiguration {

    @Value("${cassandra.contactpoints}")
    private String contactPoints;

    @Value("${cassandra.port}")
    private int port;

    @Value("${cassandra.keyspace}")
    private String keySpace;

    @Bean
    public Session createSession() {
        log.info("Creating cassandra cluster");
        return Cluster.builder().addContactPoint(contactPoints).withPort(port).withoutJMXReporting().build().connect(keySpace);
    }
}
