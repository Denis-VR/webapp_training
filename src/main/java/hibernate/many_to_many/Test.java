package hibernate.many_to_many;

import hibernate.many_to_many.entity.Child;
import hibernate.many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Child.class)
				.addAnnotatedClass(Section.class)
				.buildSessionFactory();

		Session session = null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();

			//step 1
//			Section section1 = new Section("Football");
//			Child child1 = new Child("Alex", 5);
//			Child child2 = new Child("Tim", 8);
//			Child child3 = new Child("Andrey", 6);
//			section1.addChildToSection(child1);
//			section1.addChildToSection(child2);
//			section1.addChildToSection(child3);
//			session.save(section1);

			//step 2
//			Section section2 = new Section("Volleyball");
//			Section section3 = new Section("Chess");
//			Section section4 = new Section("Math");
//			Child child4 = new Child("Flex", 4);
//			child4.addSectionToChild(section2);
//			child4.addSectionToChild(section3);
//			child4.addSectionToChild(section4);
//			session.save(child4);

			//step 3
//			Section section = session.get(Section.class, 4);
//			System.out.println(section);
//			System.out.println(section.getChildList());

			//step 4
//			Child child = session.get(Child.class, 13);
//			System.out.println(child);
//			System.out.println(child.getSections());

			//step 5
//			Section section = session.get(Section.class, 4);
//			session.delete(section);

			System.out.println("Success!");
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
