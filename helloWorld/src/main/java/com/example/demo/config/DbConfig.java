package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DbConfig {
    @Bean
    public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       dataSource.setUrl("jdbc:sqlserver://localhost:1434;databaseName=DECQMIVS");
       dataSource.setUsername("sa");
       dataSource.setPassword("test");
       return dataSource;
    }

}
