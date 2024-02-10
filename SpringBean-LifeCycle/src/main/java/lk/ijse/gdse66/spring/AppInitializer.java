package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:00 AM - 2/10/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        //ctx.close();

        SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);

        SpringBean springBean2 = ctx.getBean(SpringBean.class);
        System.out.println(springBean2);

        ctx.close();
    }
}