package hibernateTest.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4Update {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        session.createQuery("UPDATE Employee set salary = 1000" +       // изменение полей у нескольких работников
                "where name = 'Oleg'").executeUpdate();

//        Employee emp = session.get(Employee.class, 1);                   // изменение полей у одного работника
//        emp.setSalary(1500);
        session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}

