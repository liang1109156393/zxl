package com.mybatisplus;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 09:37
 **/
public class MybatisPlusTXT {
    /***
     * 创建SqlSessionFactory对象在MybatisPlusAutoConfiguration类中，同时在MybatisConfiguration中使用MybatisMapperRegistry类注入mapper接口
     * 创建SqlSessionFactory对象并注入到SqlSessionTemplate类中 ， 在MybatisPlusAutoConfiguration类中
     * 创建mapper bean对象时,根据@MapperScan的设置(默认MapperFactoryBean)将dao层的mapper接口设置MapperFactoryBean继承SqlSessionDaoSupport
     * 后期设置MapperFactoryBean属性设置时,SqlSessionDaoSupport注入SqlSessionTemplate
     * MapperFactoryBean的getObject()方法获取mapper的bean，在MybatisMapperRegistry.getMapper中根据PageMapperProxyFactory代理工厂创建PageMapperProxy代理类
     * */


}
