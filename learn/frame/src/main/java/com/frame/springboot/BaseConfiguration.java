package com.frame.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-20 16:04
 **/
@Import({MyAutoConfiguration.class})
@MyImport
@MyBeanDeifnition
@Configuration
public class BaseConfiguration {
}
