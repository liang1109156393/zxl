package com.example.demo.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-09 08:51
 **/
@Service
public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcess() {
        System.out.println("第一步: MyBeanFactoryPostProcess ---->构造函数");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("第二步：调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
        BeanDefinition bd = beanFactory.getBeanDefinition("person");
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("remark")) {
            pv.addPropertyValue("remark", "在BeanFactoryPostProcessor中修改之后的备忘信息");
        }
    }
}
