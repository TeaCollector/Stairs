package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Hello im cat from constructor!");
    }

    public String toString() {
        return "I'm message from toString method";
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
