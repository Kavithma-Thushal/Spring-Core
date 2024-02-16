package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:53 AM - 2/10/2024
 **/
@Component
public class Sachini implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean, GoodGirl {

    public Sachini() {
        System.out.println("Sachini - Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Sachini - Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Sachini - Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Sachini - Bean ApplicationContext Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Sachini - Bean Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Sachini - Bean Destroyed");
    }

    @Override
    public void loveHim() {
        System.out.println("Sachini - I loves Kamal");
    }
}