package spring_introduction;

import org.springframework.stereotype.Component;

@Component("superFrog")
public class Frog implements Pet {
    @Override

    public void say() {
        System.out.println("Quaaa-qua...");
    }
}
