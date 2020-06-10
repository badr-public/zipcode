package br.com.badr;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnablePrometheusMetrics
public class AppStart {

	public static void main(String[] args) throws Exception {
		SpringApplication tSa = new SpringApplication(AppStart.class);
		tSa.setBannerMode(Mode.OFF);
		tSa.run(args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
}
