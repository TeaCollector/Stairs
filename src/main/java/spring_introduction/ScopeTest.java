package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                 new ClassPathXmlApplicationContext("applicationContextWithXMLAndAnnot.xml");
        Person person = context.getBean("personBean", Person.class);
        Person person1 = context.getBean("personBean", Person.class);
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person1 == person);
        context.close();
    }
}
