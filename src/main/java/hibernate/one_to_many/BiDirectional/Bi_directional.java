package hibernate.one_to_many.BiDirectional;

import hibernate.one_to_many.BiDirectional.entity.Department;
import hibernate.one_to_many.BiDirectional.entity.Employees3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bi_directional {
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
//			Department department = new Department("IT", 300, 1200);
//			Employees3 emp1 = new Employees3("Alex", "Brodin", 3200);
//			Employees3 emp2 = new Employees3("Liza", "Smirnova", 1000);
//			department.addEmployeeToDepartment(emp1);
//			department.addEmployeeToDepartment(emp2);
//			session.save(department);

			//Step 2
//			Department department = session.get(Department.class, 1);
//			System.out.println(department);
//			System.out.println(department.getEmps());

			//Step 3
//			Employees3 employees3 = session.get(Employees3.class, 1);
//			System.out.println(employees3.getDepartment());

			//Step 4
//			Employees3 employees3 = session.get(Employees3.class, 1);
//			session.delete(employees3);

			System.out.println("Success!");
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
