package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {

    @Before("aop.aspect.MyPointCuts.forAllAddMethods()")
    public void checkSecurityOnGetMethod() {
        System.out.println("Security complete! ");
        System.out.println("------------------------------------------------------------");
    }

}
