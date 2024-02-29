package lk.ijse.gdse66.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 10:08 AM - 2/10/2024
 **/
@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean ApplicationContext Aware : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing Bean with Post Construct");
    }

    @PreDestroy
    public void disposable() {
        System.out.println("Disposable Bean with Pre Destroy");
    }
}