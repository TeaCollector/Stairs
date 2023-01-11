package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String name = uniLibrary.returnBook();
        System.out.println("In library was return the book " + name);
        System.out.println("Method mai was ended");
        context.close();
    }
}
