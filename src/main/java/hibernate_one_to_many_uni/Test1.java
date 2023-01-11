package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            Department dep1 = new Department("HR", "500", "1500");
            Department dep2 = new Department("HTTP", "900", "1900");

            Employee emp1 = new Employee("Oleg", "Ivanov", 800);
            Employee emp2 = new Employee("Andrey", "Supov", 1300);
            Employee emp3 = new Employee("Misha", "Golub'", 1000);
            Employee emp4 = new Employee("Foma", "Artem", 990);
            Employee emp5 = new Employee("Vasiliy", "Ozerov", 5000);

/*            dep1.addEmploeeToDepartment(emp1);
            dep1.addEmploeeToDepartment(emp2);
            dep2.addEmploeeToDepartment(emp3);*/
            dep2.addEmploeeToDepartment(emp5);

            session.beginTransaction();

//            session.save(dep1);
            session.save(emp5);

            session.getTransaction().commit();

/*            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);

            System.out.println(employee);

            session.getTransaction().commit();*/

/*            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 2);

            System.out.println(department);

            System.out.println(department.getEmps());

            session.getTransaction().commit();*/



 /*           session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 12);
            session.delete(department);

            session.getTransaction().commit();*/

/*            session = factory.getCurrentSession();
            session.beginTransaction();


            session.createQuery("delete Employee").executeUpdate();

            session.getTransaction().commit();*/

        } finally {
            session.close();
            factory.close();
        }
    }
}
