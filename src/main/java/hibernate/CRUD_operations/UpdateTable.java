package hibernate.CRUD_operations;

import hibernate.CRUD_operations.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateTable {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();

//			Employee emp = session.get(Employee.class, 1);
//			emp.setDepartment("HR");
//			emp.setSalary(3500);

			session.createQuery("update Employee set salary = salary + 1000 " +
					"where salary < 4000").executeUpdate();

			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}
}
