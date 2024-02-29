package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : Kavithma Thushal
 * @project : Various-Configuration
 * @since : 11:21 AM - 2/22/2024
 **/
@Configuration
@ComponentScan("lk.ijse.gdse66.spring.bean")
@ImportResource("classpath:context.xml")
//@ImportResource({"classpath:context.xml","classpath:context2.xml"})
//@ImportResource("file:home/.../context.xml")
@Import({DAOConfig.class, BOConfig.class})
public class AppConfig {
}