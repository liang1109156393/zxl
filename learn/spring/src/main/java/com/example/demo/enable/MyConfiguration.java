package com.example.demo.enable;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-22 14:22
 **/
public class MyConfiguration {
    @Bean
    public String testBean() {
        return "this is my test bean.";
    }
}
