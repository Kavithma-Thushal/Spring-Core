package com.edu.ijse;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 8:02 AM - 2/3/2024
 **/
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SpringBean4 {
    public SpringBean4() {
        System.out.println("SpringBean4 instance is created");
    }

    /*@Bean
    protected static JavaBean getJavaBean() {
        return new JavaBean();
    }*/
}