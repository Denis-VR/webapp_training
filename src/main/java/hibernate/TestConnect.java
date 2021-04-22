package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConnect {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			Employee emp = new Employee("Tim", "Polo", "IT", 500);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}