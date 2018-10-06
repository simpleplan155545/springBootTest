package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//如果尚未配置DB出exception:Failed to configure a DataSource: ‘url’ attribute is not specified and no embedded datasource could be configured.
//先用加exclude版
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) 
//@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
