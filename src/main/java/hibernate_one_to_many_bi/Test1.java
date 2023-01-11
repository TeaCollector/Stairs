package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
  /*          session = factory.getCurrentSession();

            Department dep1 = new Department("Sales", "800", "1900");

            Employee emp1 = new Employee("Alex", "Urakomov", 790);
            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
            Employee emp3 = new Employee("Anton", "Koleso", 1300);

            dep1.addEmploeeToDepartment(emp1);
            dep1.addEmploeeToDepartment(emp2);
            dep1.addEmploeeToDepartment(emp3 );

            session.beginTransaction();

            session.save(dep1);

            session.getTransaction().commit();*/



/*              session = factory.getCurrentSession();
            session.beginTransaction();



            Employee employee = session.get(Employee.class, 18);

            System.out.println(employee);

            System.out.println(employee.getDepartment());

            session.getTransaction().commit();*/


            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get Department.");
            Department department = session.get(Department.class, 18);
            System.out.println("Show department.");
            System.out.println(department);

            System.out.println("Load our employee:");

            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department.");
            System.out.println(department.getEmps());




      /*      session = factory.getCurrentSession();
            session.beginTransaction();


            session.createQuery("delete Department").executeUpdate();

            session.getTransaction().commit();*/

        } finally {
            session.close();
            factory.close();
        }
    }
}
