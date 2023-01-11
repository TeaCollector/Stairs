package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudets() {
        Student st1 = new Student("Alexander Sergeev", 3, 4.9);
        Student st2 = new Student("Ivan Prohorov", 5, 1.9);
        Student st3 = new Student("Mihail Ivanov", 2, 2.9);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("It's beginning work of method: getStudents.");
//        System.out.println(studentList.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(studentList);
        return studentList;

    }
}
