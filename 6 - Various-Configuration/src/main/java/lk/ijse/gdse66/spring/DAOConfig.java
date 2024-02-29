package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.dao.DAOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : Various-Configuration
 * @since : 11:52 AM - 2/22/2024
 **/
@Configuration
public class DAOConfig {
    @Bean
    public DAOSpringBean daoSpringBean() {
        return new DAOSpringBean();
    }
}