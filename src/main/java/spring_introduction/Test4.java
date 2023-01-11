package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextScope.xml");

//        Dog dog = context.getBean("myPet", Dog.class);
//        dog.setName("Pushok");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Jack");
//        System.out.println(dog.getName());
//        System.out.println(myDog.getName());

        Dog beutyDog = context.getBean("myPet", Dog.class);



//        System.out.println(dog);
//        System.out.println(myDog);
//        System.out.println(dog == myDog);

    }
}
