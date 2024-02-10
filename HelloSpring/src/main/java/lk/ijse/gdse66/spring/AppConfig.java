package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBean4;
import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 6:16 PM - 2/2/2024
 **/
@Configuration
@ComponentScan
//@ComponentScan(basePackages = "com.edu.ijse")
//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
@ComponentScan(basePackages = {"com.edu.ijse","lk.ijse.gdse66.spring.bean"})
//@ComponentScan(basePackages = {"com","lk"})
//@ComponentScan(basePackageClasses = SpringBean.class)
//@ComponentScan(basePackageClasses = {SpringBean.class, SpringBean4.class})
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig instance is created");
    }

    @Scope("prototype")
    //@Bean("javaBean")
    @Bean
    protected static JavaBean getJavaBean() {
        return new JavaBean();
    }
}