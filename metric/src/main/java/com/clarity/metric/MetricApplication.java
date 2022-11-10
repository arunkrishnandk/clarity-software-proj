package com.clarity.metric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class MetricApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetricApplication.class, args);
	}

}
