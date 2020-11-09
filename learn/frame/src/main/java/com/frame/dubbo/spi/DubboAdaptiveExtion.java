package com.frame.dubbo.spi;

import com.frame.dubbo.spi.dubbo.AdaptiveExt2;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-26 10:51
 **/
public class DubboAdaptiveExtion {
    public static void main(String[] args) {
        ExtensionLoader<AdaptiveExt2> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt2.class);
        AdaptiveExt2 adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        url = URL.valueOf("test://localhost/test?adaptive.ext2=cloud");
        /*@Adaptive注解在实现类上优于 url上，url优于@Spi默认值
         * */
        System.out.println(adaptiveExtension.echo("d", url));
    }
}
