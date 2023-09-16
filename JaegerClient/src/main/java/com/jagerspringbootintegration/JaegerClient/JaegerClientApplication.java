package com.jagerspringbootintegration.JaegerClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class JaegerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaegerClientApplication.class, args);
	}

}
