package com.example.dubbo.spi.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 10:47
 **/
@SPI("dubbo")
public interface AdaptiveExt2 {

    String msg = "zxl";
    @Adaptive
    String echo(String msg, URL url);
}
