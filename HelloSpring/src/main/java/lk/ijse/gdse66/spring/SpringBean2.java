package lk.ijse.gdse66.spring;

import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 8:02 AM - 2/3/2024
 **/
@Component(value = "sb")
public class SpringBean2 {
    public SpringBean2() {
        System.out.println("SpringBean2 instance is created");
    }
}