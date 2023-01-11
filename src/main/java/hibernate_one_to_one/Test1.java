/*
package hibernate_one_to_one;

import hibernate.test2.entity.Detail;
import hibernate.test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Employee empl = new Employee("Renat", "Bikulov", "IT", 690);
            Detail detail = new Detail("Kazan'", "+43-345-12-546", "bikulov@mail.dron");
            empl.setEmpDetail(detail);
            session.beginTransaction();

            session.save(empl);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
*/
