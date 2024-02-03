package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 6:16 PM - 2/2/2024
 **/
@Configuration
@ComponentScan
//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
//@ComponentScan(basePackageClasses = SpringBean.class)
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig instance is created");
    }
}