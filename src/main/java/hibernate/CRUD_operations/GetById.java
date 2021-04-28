package hibernate.CRUD_operations;

import hibernate.CRUD_operations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetById {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			int myId = 3;
			session.beginTransaction();
			Employee employee = session.get(Employee.class, myId);
			System.out.println(employee);

			Employee emp = new Employee("Alex", "Bre", "Sales", 4500);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}
