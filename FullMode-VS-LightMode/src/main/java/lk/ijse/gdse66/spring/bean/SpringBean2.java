package lk.ijse.gdse66.spring.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author : Kavithma Thushal
 * @project : FullModeVSLightMode
 * @since : 9:27 AM - 2/22/2024
 **/
/*SpringBean2 is in Full Mode*/
public class SpringBean2 {
    public SpringBean2(SpringBean4 springBean4) {
        System.out.println("SpringBean2 - Constructor : " + springBean4);
    }

    /*@Bean
    public SpringBean3 getSpringBean3() {
        return new SpringBean3();
    }*/
}