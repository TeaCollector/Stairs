package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvice: Detected attempt to return the book in library!");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("The exception was catched" + e);
            targetMethodResult = "Unknown name of the book";
        }
//        targetMethodResult = "Red and Black";
        System.out.println("aroundReturningBookLoggingAdvice: RETURNING THE BOOK WAS SUCCESSFUL.");
        return  targetMethodResult;
    }
}
