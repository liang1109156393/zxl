package com.basic.proxy.JdkProxy.dynamicProxy;

import com.basic.proxy.JdkProxy.staticProxy.AUserDao;
import com.basic.proxy.JdkProxy.staticProxy.IUserDTO;
import com.basic.proxy.JdkProxy.staticProxy.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.newProxyInstance;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:48
 **/
public class ProxyFactory {
    //维护一个目标对象



    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        newProxyInstance(
                SqlSessionFactory.class.getClassLoader(),
                new Class[] { SqlSession.class },
                new MyInvocation());


        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class[] {IUserDTO.class},
                new MyInvocation()
        );
    }

    static class MyInvocation implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            //代理中不关心接口的实现，只在调用的时候,跟目标对象有关
            AUserDao aUserDao = new AUserDao();
            UserDao userDao = new UserDao();
            System.out.println("开始事务2");
            //执行目标对象方法
            Object returnValue = method.invoke(userDao, args);
            System.out.println("提交事务2");
            return returnValue;
        }
        public void say(){
            System.out.println("ddddddddddddddddddddddddd");
        }


    }


}
