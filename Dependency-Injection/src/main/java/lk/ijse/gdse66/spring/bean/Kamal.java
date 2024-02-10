package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:52 AM - 2/10/2024
 **/
@Component
public class Kamal implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public Kamal() {
        System.out.println("Kamal - Instantiate");
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

    @Override
    public void destroy() throws Exception {
        System.out.println("Kamal - Bean Destroyed");
    }
}