package com.mybatisplus.config;

import com.mybatisplus.config.HikariDataSourceForProxyConfig;
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
       })
public class ImportConfig {

}
