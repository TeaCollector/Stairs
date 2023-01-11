package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.security.Security;

@Component
@Aspect
@Order(2)
public class LoggingAspect {
//
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void onlyRerturnMagazine() {}
//
//    @Pointcut("allMethodFromUniLibrary() && !onlyRerturnMagazine()")
//    private void allMethodWithoutReturnMagazine() {}
//
//    @Before("allMethodWithoutReturnMagazine()")
//    public void beforeAllMethodWithoutReturnMagazine() {
//        System.out.println("Log number 4!!!!");
//    }


//
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary() {}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary() {}
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log №3");
//    }
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("BeforeGetLoggingAdvice: writing Log №1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("BeforeReturnLoggingAdvice: writing Log №2");
//    }



//    @Before("execution(public void aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforGetBookAdvice: attempt to recieve book");
//    }
//
//    @Before("execution(public void getBook())")
//    public void beforeAnyGet() {
//        System.out.println("Now we using the Any method with name 'get'.");
//    }
//
//    @Before("execution( * returnBook())")
//    public void beforeReturnBook(){
//        System.out.println("Advice before return book");
//    }




    @Before("aop.aspect.MyPointCuts.forAllAddMethods()")
    public void addLogMethodWithAllGet(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " + methodSignature);
        System.out.println("Method signature.getMethod: " + methodSignature.getMethod());
        System.out.println("Method signature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("Method signature.getName: " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for(Object obj: args) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Information about book: " + myBook.getName() +
                            ", author: " + myBook.getAuthor() + ", years: " + myBook.getYearOfPublished());
                }

                else if(obj instanceof String) {
                    System.out.println("Book at the library add " + obj);
                }
            }
        }
        System.out.println("Logging all action: 1, 2, 3, 4, 5");
        System.out.println("------------------------------------------------------------");
    }



}
