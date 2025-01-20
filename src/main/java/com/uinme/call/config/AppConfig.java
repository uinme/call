package com.uinme.call.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.uinme.call.App;

@Configuration
@ComponentScan(basePackageClasses = App.class)
public class AppConfig {
    @Bean
    DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/niiotmart");
        dataSource.setUsername("niiotmart");
        dataSource.setPassword("p@ssw0rd");
        return dataSource;
    }
    
    @Bean
    SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }
}
