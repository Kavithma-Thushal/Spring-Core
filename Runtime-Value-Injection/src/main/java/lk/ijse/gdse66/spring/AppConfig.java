package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : Kavithma Thushal
 * @project : runtime-value-injection
 * @since : 12:38 PM - 2/22/2024
 **/
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class AppConfig {
    /*@Bean
    public String getString() {
        return "IJSE";
    }*/
}