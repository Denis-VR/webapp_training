package hibernate.CRUD_operations;

import hibernate.CRUD_operations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MethodSave {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			Employee emp = new Employee("Alex", "Bre", "Sales", 4500);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}
