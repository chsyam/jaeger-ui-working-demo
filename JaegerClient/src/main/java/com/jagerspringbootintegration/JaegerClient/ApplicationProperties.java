package com.jagerspringbootintegration.JaegerClient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
	private String jaegerServerUrl;

	public String getJaegerServerUrl() {
		return jaegerServerUrl;
	}

	public void setJaegerServerUrl(String jaegerServerUrl) {
		this.jaegerServerUrl = jaegerServerUrl;
	}

	public Jaeger getJaeger() {
		return jaeger;
	}

	public void setJaeger(Jaeger jaeger) {
		this.jaeger = jaeger;
	}

	private Jaeger jaeger = new Jaeger();

	public static class Jaeger {
		public boolean enabled = true;
		private Long timeout;
		private String endpoint;

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public Long getTimeout() {
			return timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public String getEndpoint() {
			return endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

	}
}
