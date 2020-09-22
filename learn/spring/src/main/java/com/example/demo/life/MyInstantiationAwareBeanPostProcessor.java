package com.example.demo.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-09 09:33
 **/
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    public MyInstantiationAwareBeanPostProcessor() {
        System.out.println("第四步: MyInstantiationAwareBeanPostProcessor ----->构造器");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("第五步: MyInstantiationAwareBeanPostProcessor ----------->postProcessBeforeInstantiation ");
           // return new Person();
        }
        //返回null 才会执行后面的初始化方法 否则 BeanPostProcessor beanPostProcessorsAfterInitialization初始化方法 跳过 postProcessAfterInstantiation  postProcessBeforeInstantiation postProcessProperties方法
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("第七步: MyInstantiationAwareBeanPostProcessor -------->postProcessAfterInstantiation");
            //返回true 才会执行 postProcessPropertyValues
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            System.out.println("第八步: MyInstantiationAwareBeanPostProcessor ----->postProcessProperties");
        }
        return pvs;
    }


    static class CglibProxy implements MethodInterceptor {
        private Object target;

        public CglibProxy(Object target) {
            this.target = target;
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("###   before invocation");
            Object result = method.invoke(target, objects);
            System.out.println("###   end invocation");
            return result;
        }

        public static Object getProxy(Object target) {
            Enhancer enhancer = new Enhancer();
            // 设置需要代理的对象
            enhancer.setSuperclass(target.getClass());
            // 设置代理人
            enhancer.setCallback(new CglibProxy(target));
            return enhancer.create();
        }


    }
}