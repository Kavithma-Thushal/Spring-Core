package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBean4;
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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println("");

        AppConfig appConfig = ctx.getBean(AppConfig.class);
        System.out.println(appConfig);

        // Access spring bean through class type
        SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);

        // Access spring bean through bean id (default bean id)
        /*SpringBean springBean = (SpringBean) ctx.getBean("springBean");
        System.out.println(springBean);*/

        //ctx.close();

        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shutdown");
                ctx.close();
            }
        }));*/

        //ctx.registerShutdownHook();

        SpringBean2 springBean2 = ctx.getBean(SpringBean2.class);
        System.out.println(springBean2);

        SpringBean3 springBean3 = ctx.getBean(SpringBean3.class);
        System.out.println(springBean3);

        SpringBean4 springBean4 = ctx.getBean(SpringBean4.class);
        System.out.println(springBean4);

        JavaBean javaBean = ctx.getBean(JavaBean.class);
        System.out.println(javaBean);

        System.out.println("");

        // Bean eka hdnna awashya knowledge eka tid blnawa
        boolean springBeanDefinition = ctx.containsBeanDefinition("springBean");
        System.out.println(springBeanDefinition);

        boolean springBean2Definition = ctx.containsBeanDefinition("sb");
        System.out.println(springBean2Definition);

        boolean springBean3Definition = ctx.containsBeanDefinition("springBean3");
        System.out.println(springBean3Definition);

        boolean springBean4Definition = ctx.containsBeanDefinition("springBean4");
        System.out.println(springBean4Definition);

        boolean getJavaBeanDefinition = ctx.containsBeanDefinition("getJavaBean");
        System.out.println(getJavaBeanDefinition);

        System.out.println("");

        SpringBean4 bean = ctx.getBean(SpringBean4.class);
        System.out.println(bean);

        SpringBean4 bean2 = ctx.getBean(SpringBean4.class);
        System.out.println(bean2);

        SpringBean4 bean3 = ctx.getBean(SpringBean4.class);
        System.out.println(bean3);

        System.out.println("");

        JavaBean bean4 = ctx.getBean(JavaBean.class);
        System.out.println(bean4);

        JavaBean bean5 = ctx.getBean(JavaBean.class);
        System.out.println(bean5);

        JavaBean bean6 = ctx.getBean(JavaBean.class);
        System.out.println(bean6);
    }
}