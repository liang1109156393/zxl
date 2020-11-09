package com.frame;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class BootApplication implements CommandLineRunner {
    /**
     * 自动装配实现方式:
     * 1：spring.factories中配置
     * 2：@Import注解导入
     * 若有实现ImportSelector 则执行selectImports方法
     * 实现ImportBeanDefinitionRegistrar接口
     */


    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(BootApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();

    }
}
