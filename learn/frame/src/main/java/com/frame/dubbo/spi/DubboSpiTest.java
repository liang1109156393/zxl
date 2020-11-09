package com.example.dubbo.spi;

import com.example.dubbo.spi.java.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 09:28
 **/
public class DubboSpiTest {
    @Test
    public void sayHello() throws Exception {
        /**META-INF/dubbo中的配置文件名称必须是接口包名加类名
         * 文件中必须存在相应的key
         *
         *
         * */
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
