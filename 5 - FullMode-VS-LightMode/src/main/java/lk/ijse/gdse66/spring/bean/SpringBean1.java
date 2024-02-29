package lk.ijse.gdse66.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : FullModeVSLightMode
 * @since : 9:27 AM - 2/22/2024
 **/
/*SpringBean1 is in Full Mode*/
@Component
public class SpringBean1 {

    public SpringBean1() {
        System.out.println("SpringBean1 - Constructor");
    }

    @Bean
    public SpringBean3 getSpringBean3() {
        return new SpringBean3();
    }

    /*@Bean
    public SpringBean2 getSpringBean2() {
        System.out.println("getSpringBean2() - Method is invoked");
        getSpringBean4();
        getSpringBean4();
        getSpringBean4();
        return new SpringBean2(getSpringBean4());   // Me bean eka spring manage krnne na
    }

    @Bean
    public SpringBean4 getSpringBean4() {
        System.out.println("getSpringBean4() - Method is invoked");
        return new SpringBean4();
    }*/
}