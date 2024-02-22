package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean2;
import lk.ijse.gdse66.spring.bean.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : FullModeVSLightMode
 * @since : 9:27 AM - 2/22/2024
 **/
@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public SpringBean2 getSpringBean2() {
        System.out.println("getSpringBean2() - Method is invoked");
        return new SpringBean2(getSpringBean4());
    }

    @Bean
    public SpringBean4 getSpringBean4() {
        System.out.println("getSpringBean4() - Method is invoked");
        return new SpringBean4();
    }
}