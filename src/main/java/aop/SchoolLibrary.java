package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("It's a school library, guys!");
    }
}
