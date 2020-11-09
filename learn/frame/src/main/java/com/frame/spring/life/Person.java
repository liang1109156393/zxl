package com.example.demo.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-09 08:53
 **/
@Component
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String name;
    private String address;
    private String desc;
    private String remark;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    @Qualifier("user1")
    private User user;
    public Person() {
        System.out.println("第六步: 实例化person ---------->构造函数");
    }

    @PostConstruct
    public void init() {
        System.out.println("第十三步: @PostConstruct(优先于 xml配置的init方法) ---------->init");
        this.name = "zxl";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    @Value("${hello}")
    public void setAddress(String address) {
        System.out.println("第九步:【注入属性】注入属性name");
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第十一步: BeanFactoryAware ------->setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("第十步: BeanNameAware ------->setBeanName");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十五步: DisposableBean ------->destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第十四步: InitializingBean ------->afterPropertiesSet");
    }



    public static Field[] getClassFields(Class<?> clazz) {
        List<Field> list = new ArrayList<Field>();
        Field[] fields;
        do {
            fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                list.add(fields[i]);
            }
            clazz = clazz.getSuperclass();
        } while (clazz != Object.class && clazz != null);
        return list.toArray(fields);
    }


    public static void main(String[] args) {
        Field[] classFields = Person.getClassFields(Person.class);
        System.out.println("=========");

    }




}
