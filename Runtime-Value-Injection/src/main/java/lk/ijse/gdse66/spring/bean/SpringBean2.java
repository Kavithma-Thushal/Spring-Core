package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : runtime-value-injection
 * @since : 2:43 PM - 2/22/2024
 **/
//@Component
public class SpringBean2 {
    public SpringBean2(@Value("${user.name}") String username,
                       @Value("${USERDOMAIN}") String domain,
                       @Value("${app.env1}") String env1,
                       @Value("${app.env2}") String env2,
                       @Value("${app.env3}") String env3,
                       @Value("${app.env4}") String env4) {

        System.out.println("SpringBean2() - Constructor");
        System.out.println("user.name = " + username);
        System.out.println("USERDOMAIN = " + domain);
        System.out.println("Environment 1 = " + env1);
        System.out.println("Environment 2 = " + env2);
        System.out.println("Environment 3 = " + env3);
        System.out.println("Environment 4 = " + env4);
    }
}