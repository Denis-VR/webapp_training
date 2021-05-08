package hibernate.one_to_many.UniDirectional;

import hibernate.one_to_many.UniDirectional.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Uni_directional {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employees3.class)
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
		Session session = null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();

			//Step 1
//			Department department = new Department("HR", 200, 1600);
//			Employees3 emp1 = new Employees3("Oleg", "Ivanov", 3200);
//			Employees3 emp2 = new Employees3("Andrey", "Sidorov", 1000);
//			department.addEmployeeToDepartment(emp1);
//			department.addEmployeeToDepartment(emp2);
//			session.save(department);

			//Step 2
//			Department department = session.get(Department.class, 4);
//			System.out.println(department);
//			System.out.println(department.getEmps());

			//Step 3
			Employees3 employees3 = session.get(Employees3.class, 8);
			session.delete(employees3);

			System.out.println("Success!");
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
