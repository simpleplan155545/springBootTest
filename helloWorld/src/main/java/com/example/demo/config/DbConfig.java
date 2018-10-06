//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//

//Field jdbcTemplate in com.example.demo.userDao.UserDao required a bean of type 'org.springframework.jdbc.core.JdbcTemplate' that could not be found.
//當使用@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) ，可使用config當application.properties檔設定ＤＢ
//@Configuration
//public class DbConfig {
//    @Bean
//    public DataSource dataSource(){
//       DriverManagerDataSource dataSource = new DriverManagerDataSource();
//       dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//       dataSource.setUrl("jdbc:sqlserver://localhost:1434;databaseName=DECQMIVS");
//       dataSource.setUsername("sa");
//       dataSource.setPassword("test");
//       return dataSource;
//    }
//
//}
