package hibernateTest.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
        Session session = factory.getCurrentSession();
        session.beginTransaction();             // Начинаем транзакцию

//            List<Employee> employeeList = session.createQuery("from Employee")
//                    .getResultList();

            List<Employee> employeeList = session.createQuery("from Employee" +    // здесь пишется название класса, а не таблицы
                            " where name = 'Oleg' AND salary > 300")  // Здесь пишется название поля
                    .getResultList();

            for (Employee list: employeeList) {
                System.out.println(list);
            }
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}

