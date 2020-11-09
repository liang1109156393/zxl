package com.frame.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-09 10:02
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        System.out.println("第三步: MyBeanPostProcessor --------->构造器");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // TODO Auto-generated method stub
        if (beanName.equals("person")) {
            System.out.println("第十二步: BeanPostProcessor ------->postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("第十五步: BeanPostProcessor ------->postProcessAfterInitialization");
        }
        return bean;
    }
}
