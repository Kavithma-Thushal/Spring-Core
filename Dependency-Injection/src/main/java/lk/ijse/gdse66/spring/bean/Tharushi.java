package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Kavithma Thushal
 * @project : Spring
 * @since : 8:39 PM - 2/16/2024
 **/
@Component
@Primary
@Qualifier("Long Hair")
public class Tharushi implements GoodGirl {
    public Tharushi() {
        System.out.println("Tharushi - Constructor()");
    }

    @Override
    public void loveHim() {
        System.out.println("Tharushi - I love Kamal");
    }
}