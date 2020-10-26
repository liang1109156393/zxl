package com.example.dubbo.spi;

import org.junit.Test;

import java.util.ServiceLoader;
import com.example.dubbo.spi.java.Robot;
/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 09:07
 **/
public class JavaSpiTest {
    @Test
    public void sayHello() throws Exception {
        /*
        * META-INF/dubbo中的配置文件名称必须是接口包名加类名
        * 加载所有的Robot接口的实现(配置文件中有配置类)
        * */
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}
