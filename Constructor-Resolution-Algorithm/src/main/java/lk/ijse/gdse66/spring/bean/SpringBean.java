package lk.ijse.gdse66.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Constructor-Resolution-Algorithm
 * @since : 4:42 PM - 2/22/2024
 **/
@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean - Constructor");
    }
}