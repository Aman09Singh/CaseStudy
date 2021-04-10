package com.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceClientTrain2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceClientTrain2Application.class, args);
	}

}
