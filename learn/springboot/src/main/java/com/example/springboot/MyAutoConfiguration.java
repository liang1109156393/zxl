package com.example.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-20 13:48
 **/
@Configuration
@ConditionalOnProperty(name = "enabled.autoConfituration", matchIfMissing = true)
public class MyAutoConfiguration {
    static {
        System.out.println("myAutoConfiguration init... 配置spring.factories application.properties");
    }

    @Bean
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
}
