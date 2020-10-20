package com.example.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(SpringbootApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .web(WebApplicationType.NONE)
                .run(args);

        HelloService helloService = (HelloService) run.getBean("helloService");
        helloService.getsService();
        ;

    }

    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();

    }
}
