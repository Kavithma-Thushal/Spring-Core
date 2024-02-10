package lk.ijse.gdse66.spring.bean;

import lk.ijse.gdse66.spring.util.Injector;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:52 AM - 2/10/2024
 **/
@Component
public class Kamal implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, Injector {

    /*// Property/Field Injection
    @Autowired
    private GoodGirl gf;*/

    /*// Setter Method Injection
    private GoodGirl gf;

    @Autowired
    public void setGoodGirl(GoodGirl gf) {
        this.gf = gf;
    }*/

    // Interface Injection
    private GoodGirl gf;

    @Autowired
    @Override
    public void inject(GoodGirl gf) {
        this.gf = gf;
    }

    public Kamal() {
        System.out.println("Kamal - Instantiate");
        System.out.println("Kamal - Have I got a girl friend ? " + gf);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Kamal - Bean Name Aware : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Kamal - Bean Factory Aware : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Kamal - Bean ApplicationContext Aware : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Kamal - Bean Initializing");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Kamal - Have I got a girl friend ? " + gf);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Kamal - Bean Destroyed");
    }
}