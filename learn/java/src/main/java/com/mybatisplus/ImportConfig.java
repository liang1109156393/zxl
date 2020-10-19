package com.mybatisplus;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 15:30
 **/
@Configuration
@Import({/*EntityInputIdMetaHandler.class, DubboConfig.class,
        RedisConfig.class,*/
        HikariDataSourceForProxyConfig.class,
        CacheConfig.class,
       })
public class ImportConfig {

}
