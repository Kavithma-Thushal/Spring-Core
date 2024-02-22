package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Kavithma Thushal
 * @project : Various-Configuration
 * @since : 11:20 AM - 2/22/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        /*ctx.register(DAOConfig.class);
        ctx.register(BOConfig.class);*/
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}