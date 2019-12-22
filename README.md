# Spring Boot with Kafka Producer Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic
## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Example_Topic`

## Start Kafka Producer
- `bin/kafka-console-producer.sh -broker-list localhost:9092 --topic Example_Topic`

# Running locally

## Start cassandra in docker

- `docker run -p 9042:9042 --rm --name cassandra -d cassandra:3.11`
- `docker exec -it cassandra bash`
- `cqlsh`
- `CREATE KEYSPACE kafkaevents WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};`
- `CREATE TABLE event (uuid uuid primary key, message varchar);`
   
