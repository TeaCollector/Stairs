package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithXMLAndAnnot.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYouPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
//        Cat cat = context.getBean("cat", Cat.class);
//        cat.say();
        context.close();

    }
}
