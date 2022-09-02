package com.fundamentos.sprigboot.fundamentos.configuration;

import com.fundamentos.sprigboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Impl(); // se instancia la implementacion del bean
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImpl(); // se instancia la implementacion del bean
    }

    @Bean
    public MyBeanWithDependecy beanOperationDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImpl(myOperation);
    }
}
