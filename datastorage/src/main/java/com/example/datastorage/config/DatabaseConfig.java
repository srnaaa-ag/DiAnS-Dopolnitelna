package com.example.datastorage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.datastorage.repository.postgresql")
@EnableCassandraRepositories(basePackages = "com.example.datastorage.repository.cassandra")
public class DataConfig extends CassandraConfiguration {

    @Override
    public String getKeyspaceName() {
        return "stockexchange_keyspace";  // Замени со твоето име на Cassandra keyspace
    }

    @Override
    protected String getContactPoints() {
        return "localhost";  // Постави точниот хост за Cassandra сервер
    }

    @Override
    protected int getPort() {
        return 9042;  // Постави точниот порт за Cassandra сервер
    }

}
