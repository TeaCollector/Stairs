package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("person", Person.class);
//        person.callYouPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());




        context.close();
    }
}
