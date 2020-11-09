package com.frame.dubbo.spi.dubbo;

import com.frame.dubbo.spi.dubbo.AdaptiveExt2;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 10:48
 **/

public class SpringCloudAdaptiveExt2 implements AdaptiveExt2 {
    @Override
    public String echo(String msg, URL url) {
        return "spring cloud";
    }
}
