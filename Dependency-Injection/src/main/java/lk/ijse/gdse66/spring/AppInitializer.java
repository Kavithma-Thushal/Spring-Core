package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.Kamal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:51 AM - 2/10/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        /*Kamal kamal = ctx.getBean(Kamal.class);
        System.out.println(kamal);

        System.out.println("--------------------------------------------------------------------");

        Kamal kamal2 = ctx.getBean(Kamal.class);
        System.out.println(kamal2);*/
    }
}