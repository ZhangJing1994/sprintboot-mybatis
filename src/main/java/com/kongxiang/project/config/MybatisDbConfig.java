package com.kongxiang.project.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by garychen on 17/8/10.
 */
@Configuration
@MapperScan(basePackages = {"com.kongxiang.project.dao.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisDbConfig {
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Value("${mybatis.mapper-locations}")
    private String mapperXml;
    //设置mybatis-config.xml配置文件位置
    //  加载全局的配置文件
    @Value("${mybatis.config-location}")
    private String configLocation;
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource); // 使用titan数据源, 连接titan库
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(mapperXml));
        factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configLocation));
        return factoryBean.getObject();

    }
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory()); // 使用上面配置的Factory
        return template;
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
