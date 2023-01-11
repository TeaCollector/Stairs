package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: Logging list of students");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterreturningStudentsLoggingAdvicr(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getNameSurName();
//        name = "Mr. " + name;
//        firstStudent.setNameSurName(name);
//
//        double avg = firstStudent.getAvgGrade();
//        avg = avg / 2;
//        firstStudent.setAvgGrade(avg);
//
//        System.out.println("afterreturningStudentsLoggingAdvicr: Logging list of students" +
//                " after work method AfterReturning");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudents(Throwable exception) {
//        System.out.println("HEY BROTHER LOOK AT THIS: THIS IS EXCEPTION!!!" + exception);
//    }

    @After("execution(* getStudents())")
    public void AFTERMethodGetStudents() {
        System.out.println("I'm @After - advice");
    }
}
