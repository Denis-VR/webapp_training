package hibernate.CRUD_operations;

import hibernate.CRUD_operations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCommand {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

//			Employee emp = session.get(Employee.class, 3);
//			session.delete(emp);

			session.createQuery("delete Employee where surname like 'Didi'").executeUpdate();

			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}