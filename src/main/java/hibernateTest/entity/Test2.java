package hibernateTest.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
        Session session = factory.getCurrentSession();
//        Employee employee = new Employee("Oleg", "Scalarom", "IT", 934);
        session.beginTransaction();                 // Начинаем транзакцию
//        session.save(employee);                     // Сохранение объекта в таблице
//        session.getTransaction().commit();          // Закрытие сессии

//        int myId = employee.getId();

        // Создаем ниже новую сессию, в предыдущей мы завершили все действия:

//        session = factory.getCurrentSession();
//        session.beginTransaction();
        Employee receiveEmpl = session.get(Employee.class, 7);       // Зак команду get() отвечает SELECT, получаем работника
        session.getTransaction().commit();

        System.out.println(receiveEmpl);


    } finally {
            factory.close();
        }
    }
}

