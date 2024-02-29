package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : Kavithma Thushal
 * @project : FullModeVSLightMode
 * @since : 9:27 AM - 2/22/2024
 **/
/*SpringBean4 is in Full Mode*/
public class SpringBean4 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean4() {
        System.out.println("SpringBean4 - Constructor : " + this);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SpringBean4 - Bean Name Aware : " + this);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean4 - Bean Factory Aware : " + this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean4 - Application Context Aware : " + this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean4 - Bean Initializing : " + this);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean4 - Bean Destroyed : " + this);
    }
}