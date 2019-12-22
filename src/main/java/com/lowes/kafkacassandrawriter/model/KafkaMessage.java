package com.lowes.kafkacassandrawriter.model;

import java.util.UUID;
import lombok.Data;

@Data
public class KafkaMessage {

    private UUID uuid;
    private String message;
}
