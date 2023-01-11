package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* aop.UniLibrary.add*(..))")
    public void forAllAddMethods() {}
}
