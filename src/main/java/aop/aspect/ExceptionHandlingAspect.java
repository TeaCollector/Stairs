package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order
public class ExceptionHandlingAspect {
    @Before("aop.aspect.MyPointCuts.forAllAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("Catching the exception when you want to recieve book/magazine.");
        System.out.println("------------------------------------------------------------");
    }
}
