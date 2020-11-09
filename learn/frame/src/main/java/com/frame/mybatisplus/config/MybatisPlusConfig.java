package com.frame.mybatisplus.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 13:33
 **/
@Configuration
@MapperScan("com.frame.mybatisplus.dto")
public class MybatisPlusConfig {

/*
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor paginationInterceptor = new MybatisPlusInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
    // 设置最大单页限制数量，默认 500 条，-1 不受限制
    // paginationInterceptor.setLimit(500);
    // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return paginationInterceptor;
}
*/

}
