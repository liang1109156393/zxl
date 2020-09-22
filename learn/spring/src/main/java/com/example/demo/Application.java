package com.example.demo;

import com.example.demo.enable.EnableMyConfig;
import com.example.demo.enable.HelloWorld;
import com.example.demo.enable.HelloWorld2;
import com.example.demo.life.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableMyConfig
@Slf4j
public class Application {
	@Value("${name}")
	private String name ;

	public static void main(String[] args) {
		life();
		enable();
	}

	public static void life(){
		ConfigurableApplicationContext run = new SpringApplication(Application.class).run();
		Person person = (Person)run.getBean("person");
		String userName = person.getUser().getUserName();
		System.out.println(person.getAddress());
		System.out.println(userName);
	}
	public static void enable(){
		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run();
		// 验证我们的bean是否成功注入
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.test();
		HelloWorld2 helloWorld2 = context.getBean(HelloWorld2.class);
		helloWorld2.test();
		Application bean = context.getBean(Application.class);
		System.out.println(bean.name);

		log.info(context.getBean("testBean", String.class));
	}


}
