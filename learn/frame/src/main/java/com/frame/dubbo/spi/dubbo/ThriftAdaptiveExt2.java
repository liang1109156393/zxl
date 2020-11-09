package com.frame.dubbo.spi.dubbo;

import com.frame.dubbo.spi.dubbo.AdaptiveExt2;
import org.apache.dubbo.common.URL;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 10:49
 **/
public class ThriftAdaptiveExt2 implements AdaptiveExt2 {
    @Override
    public String echo(String msg, URL url) {
        return "thrift";
    }
}
