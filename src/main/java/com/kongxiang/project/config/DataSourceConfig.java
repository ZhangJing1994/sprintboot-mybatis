package com.kongxiang.project.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置数据源
 */
@Configuration
public class DataSourceConfig {

    // 资源DB
    @Bean(name = "dataSource")
    // application.properteis中对应属性的前缀
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }

}