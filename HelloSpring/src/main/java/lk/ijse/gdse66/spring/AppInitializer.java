package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 6:12 PM - 2/2/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        AppConfig appConfig = ac.getBean(AppConfig.class);
        System.out.println(appConfig);

        SpringBean springBean = ac.getBean(SpringBean.class);
        System.out.println(springBean);

        SpringBean2 springBean2 = ac.getBean(SpringBean2.class);
        System.out.println(springBean2);
    }
}