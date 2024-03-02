package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String myString() {
        return "Amal";
    }

    @Bean
    public int myInt() {
        return 23;
    }

    @Bean
    public boolean myBoolean() {
        return true;
    }
}