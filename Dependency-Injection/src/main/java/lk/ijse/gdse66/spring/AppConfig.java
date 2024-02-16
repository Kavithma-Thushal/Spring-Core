package lk.ijse.gdse66.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:52 AM - 2/10/2024
 **/
@Configuration
@ComponentScan
public class AppConfig {
    @Qualifier("note")
    @Order(2)
    @Bean
    public String myString1() {
        return "IJSE";
    }

    @Qualifier("note")
    @Order(3)
    @Bean
    public String myString2() {
        return "ESOFT";
    }

    @Order(1)
    @Bean
    public String myString3() {
        return "SLIT";
    }
}