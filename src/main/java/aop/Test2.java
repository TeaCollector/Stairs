package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudets();
        try {
            university.getStudents();
        } catch (Exception e) {
            System.out.println("We catch the exception: " + e.getClass());
        }
//        System.out.println(students);

        context.close();

    }
}
