package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : Kavithma Thushal
 * @project : runtime-value-injection
 * @since : 4:06 PM - 2/22/2024
 **/
@Component
public class SpringBean3 {
    @Autowired
    private Environment env;

    public SpringBean3() {
        System.out.println("SpringBean3 - Constructor");
        System.out.println("Environment - " + env);
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Environment = " + env);
        System.out.println("user.name = " + env.getProperty("user.name"));
        System.out.println("USERDOMAIN = " + env.getProperty("USERDOMAIN"));
        System.out.println("Environment 1 = " + env.getProperty("app.env1"));
        System.out.println("Environment 2 = " + env.getProperty("app.env2"));
        System.out.println("Environment 3 = " + env.getProperty("app.env3"));
        System.out.println("Environment 4 = " + env.getProperty("app.env4"));
        //System.out.println("Environment 4 = " + env.getRequiredProperty("app.env4"));
    }
}