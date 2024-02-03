package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import lk.ijse.gdse66.spring.bean.SpringBean2;
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

        /*SpringBean springBean = (SpringBean) ac.getBean("springBean");
        System.out.println(springBean);*/

        SpringBean2 springBean2 = ac.getBean(SpringBean2.class);
        System.out.println(springBean2);

        /*SpringBean2 springBean2 = (SpringBean2) ac.getBean("sb");
        System.out.println(springBean2);*/

        SpringBean3 springBean3 = ac.getBean(SpringBean3.class);
        System.out.println(springBean3);

        /*SpringBean4 springBean4 = ac.getBean(SpringBean4.class);  //Error
        System.out.println(springBean4);*/
    }
}