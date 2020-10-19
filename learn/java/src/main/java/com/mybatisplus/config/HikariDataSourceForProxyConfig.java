package com.mybatisplus.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 15:26
 **/
@Configuration
@Slf4j
public class HikariDataSourceForProxyConfig {
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${db.connectionTimeout:30000}")
    private Long connectionTimeout;
    @Value("${db.maximumPoolSize:5}")
    private Integer maximumPoolSize;
    @Value("${db.minimumIdle:5}")
    private Integer minimumIdle;
    @Value("${db.maxLifetime:1800000}")
    private Long maxLifetime;
    @Value("${db.idleTimeout:600000}")
    private Long idleTimeout;
    @Value("${db.validationTimeout:3000}")
    private Long validationTimeout;
    @Value("${db.leakDetectionThreshold:60000}")
    private Long leakDetectionThreshold;
    @Value("${db.poolName:hikari-pool-connection}")
    private String poolName;

    @Primary
    @Bean("dataSource")
    public DataSource dataSource() {
        if(log.isDebugEnabled()){
            log.debug("Configuring Datasource");
            log.debug("database.url:" + dbUrl);
            log.debug("database.user:" + username);
        }
        HikariConfig config = new HikariConfig();

        config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        config.addDataSourceProperty("url", dbUrl);
        config.addDataSourceProperty("user", username);
        config.addDataSourceProperty("password", password);
        config.setConnectionTimeout(connectionTimeout);
        config.setMaximumPoolSize(maximumPoolSize);
        config.setMinimumIdle(minimumIdle);
        config.setIdleTimeout(idleTimeout);
        config.setMaxLifetime(maxLifetime);
        config.setLeakDetectionThreshold(leakDetectionThreshold);
        config.setValidationTimeout(validationTimeout);
        config.setPoolName(poolName);
        config.setConnectionTestQuery("select 1");
        HikariDataSource hikariDataSource = new HikariDataSource(config);
        return new HikariDataSource(hikariDataSource);
    }
}
