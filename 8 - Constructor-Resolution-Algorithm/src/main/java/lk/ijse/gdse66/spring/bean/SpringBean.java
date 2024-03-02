package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    private String name;
    private int age;
    private boolean isMale;
    private float temp;

    /*public SpringBean() {
        System.out.println("SpringBean() - Constructor");
    }*/

    // Greediest Constructor
    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("SpringBean(String, int, boolean)");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Male : " + isMale);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age, boolean isMale, /*@Nullable*/ float temp) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.temp = temp;
        System.out.println("SpringBean(String, int, boolean, float)");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Male : " + isMale);
        System.out.println("Temp : " + temp);
    }

    @Autowired(required = false)
    public SpringBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("SpringBean(String, int)");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}