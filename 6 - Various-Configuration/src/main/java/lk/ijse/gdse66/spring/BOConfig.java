package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bo.BOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : Various-Configuration
 * @since : 11:53 AM - 2/22/2024
 **/
@Configuration
public class BOConfig {
    @Bean
    public BOSpringBean boSpringBean() {
        return new BOSpringBean();
    }
}