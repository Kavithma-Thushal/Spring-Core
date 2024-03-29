package lk.ijse.gdse66.spring.bean;

import lk.ijse.gdse66.spring.util.Injector;
import lk.ijse.gdse66.spring.util.WhiteFace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:52 AM - 2/10/2024
 **/
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Kamal implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean/*, Injector*/ {

    /*// Property/Field Injection
    @Autowired
    private GoodGirl gf;*/

    /*// Setter Method Injection
    private GoodGirl gf;

    @Autowired
    public void setGoodGirl(GoodGirl gf) {
        this.gf = gf;
    }*/

    /*// Interface Injection
    private GoodGirl gf;

    @Autowired
    @Override
    public void inject(GoodGirl gf) {
        this.gf = gf;
    }*/

    // Constructor Injection
    private GoodGirl gf;

    @Autowired
    public Kamal(@Qualifier("Long Hair") @WhiteFace GoodGirl gf) {
        this.gf = gf;
        System.out.println("Kamal - Constructor()");
        System.out.println("Kamal - Have I got a girl friend? (Constructor) " + gf);
    }

    public Kamal() {
        System.out.println("Kamal - No Args Constructor()");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Kamal - Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Kamal - Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Kamal - Bean ApplicationContext Aware");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Kamal - Have I got a girl friend ? " + gf);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Kamal - Bean Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Kamal - Bean Destroyed");
    }
}