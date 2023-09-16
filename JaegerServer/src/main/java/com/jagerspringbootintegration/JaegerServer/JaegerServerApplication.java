package com.jagerspringbootintegration.JaegerServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class JaegerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaegerServerApplication.class, args);
	}

}
