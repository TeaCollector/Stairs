package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
/*
            session = factory.getCurrentSession();
            Section section1 = new Section("FootBall");
            Child child1 = new Child("Sashka", 7);
            Child child2 = new Child("Marinka", 9);
            Child child3 = new Child("Kol'ka", 5);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.persist(section1);

            session.getTransaction().commit();

            System.out.println("Done!!!");
*/


/*            session = factory.getCurrentSession();
            Section section1 = new Section("Dance");
            Section section2 = new Section("Math");
            Section section3 = new Section("Chess");
            Child child1 = new Child("Igor'", 9);
            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.save(child1);

            session.getTransaction().commit();

            System.out.println("Done!!!");*/

/*

            session = factory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 7);

            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done!!!");
*/


            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 6);

            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done!!!");



/*
            session = factory.getCurrentSession();


            session.beginTransaction();

            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

            System.out.println("Done!!!");
*/

        }
        finally {
            session.close();
            factory.close();

        }
    }
}
