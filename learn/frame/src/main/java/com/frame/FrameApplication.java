package com.frame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication

public class FrameApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(FrameApplication.class).web(WebApplicationType.NONE).run(args);
	}

}
