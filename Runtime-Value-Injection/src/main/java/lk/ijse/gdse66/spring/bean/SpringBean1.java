package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * @author : Kavithma Thushal
 * @project : runtime-value-injection
 * @since : 12:41 PM - 2/22/2024
 **/
//@Component
public class SpringBean1 {
    @Value("Thushal")
    private String name;

    public SpringBean1(@Value("IJSE") String myString,
                       @Value("24") int age,
                       @Value("98000.55") double salary,
                       @Value("true") boolean status,
                       @Value("12,23,34,45,56") int[] array/*,
                       @Value("12,23,34,45,56") ArrayList<Integer> arrayList*/) {

        System.out.println("SpringBean1() - Constructor : " + myString);
        System.out.println("My Name : " + name);
        System.out.println("My Age : " + age);
        System.out.println("My Salary : " + salary);
        System.out.println("My Status : " + status);
        System.out.println("My Array : " + Arrays.toString(array));
        /*System.out.println("My ArrayList : " + arrayList);*/      //Error
    }

    @PostConstruct
    public void initialize() {
        System.out.println("My Name : " + name);
    }
}