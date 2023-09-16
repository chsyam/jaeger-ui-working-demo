package com.jagerspringbootintegration.JaegerServer.config;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.jagerspringbootintegration.JaegerServer.ApplicationProperties;

import io.opentelemetry.exporter.jaeger.JaegerGrpcSpanExporter;
import io.opentelemetry.exporter.jaeger.JaegerGrpcSpanExporterBuilder;

@Configuration
public class AppConfig {
	@Bean
	JaegerGrpcSpanExporter otelJaegerGrpcSpanExporter(ApplicationProperties properties) {
		JaegerGrpcSpanExporterBuilder builder = JaegerGrpcSpanExporter.builder();
		String endpoint = properties.getJaeger().getEndpoint();
		if (StringUtils.hasText(endpoint)) {
			builder.setEndpoint(endpoint);
		}
		Long timeout = properties.getJaeger().getTimeout();
		if (timeout != null) {
			builder.setTimeout(timeout, TimeUnit.MILLISECONDS);
		}
		return builder.build();
	}

	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
