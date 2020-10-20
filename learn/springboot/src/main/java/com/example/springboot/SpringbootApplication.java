package com.example.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringbootApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.web(WebApplicationType.NONE)
				.run(args);

	}

}
