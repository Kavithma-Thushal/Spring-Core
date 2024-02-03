package lk.ijse.gdse66.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:30 AM - 2/3/2024
 **/
public class AppInitializer {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("context.xml");
    }
}