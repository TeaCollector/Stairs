package spring_introduction;


import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    private String name;

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    @PostConstruct
    public void init() {
        System.out.println("I'm init-method in class Dog.");
    }
//    @PreDestroy
    public void destroy() {
        System.out.println("I will destroy bean.");
    }

    public Dog() {
        System.out.println("Dog bean from constructor.");
    }

    @Override
    public void say() {
        System.out.println("Bow-bow!!!");
    }
}
