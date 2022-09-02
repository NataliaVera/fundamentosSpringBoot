package com.fundamentos.sprigboot.fundamentos.configuration;

import com.fundamentos.sprigboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentos.sprigboot.fundamentos.bean.MyBeanWithPropertiesImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class GeneralConfiguration {
    @Value("${value.name]")
    private  String name;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImpl(name, random);
    }

    //conexion a base de datos
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");

        return dataSourceBuilder.build();
    }


}
