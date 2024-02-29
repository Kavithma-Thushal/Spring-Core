package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean2;
import lk.ijse.gdse66.spring.bean.SpringBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
        /*myString();
        myString();
        myString();*/
        getSpringBean4();
        getSpringBean4();
        getSpringBean4();
        return new SpringBean2(getSpringBean4());
    }

    //@Scope("prototype")
    @Bean
    public SpringBean4 getSpringBean4() {
        System.out.println("getSpringBean4() - Method is invoked");
        return new SpringBean4();
    }

    public String myString() {
        System.out.println("myString() - Method is invoked");
        return "IJSE";
    }
}