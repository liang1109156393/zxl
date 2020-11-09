package com.frame.dubbo.spi.java;

import org.apache.dubbo.common.extension.SPI;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 09:15
 **/
@SPI
public interface Robot {
    void sayHello();
}
