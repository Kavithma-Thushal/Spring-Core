package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * @author : Kavithma Thushal
 * @project : runtime-value-injection
 * @since : 12:37 PM - 2/22/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*System.out.println("========================================================================");
        *//*Let's access OS environment variable in our java program*//*
        Map<String, String> map = System.getenv();
        for (String keys : map.keySet()) {
            System.out.println(keys + " = " + map.get(keys));
        }*/

        /*System.out.println("========================================================================");
        *//*Let's access JRE environment variable in our java program*//*
        Properties envVariables = System.getProperties();
        envVariables.put("City", "Galle");
        for (Object keys : envVariables.keySet()) {
            System.out.println(keys + " = " + System.getProperty(keys.toString()));
        }*/
    }
}