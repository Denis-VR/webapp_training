package hibernate.one_to_one;

import hibernate.one_to_one.entity.Detail;
import hibernate.one_to_one.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Uni_directional {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee2.class)
				.addAnnotatedClass(Detail.class)
				.buildSessionFactory();

		Session session = null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();

			//Step 1
//			Employee2 employee2 = new Employee2("Egor", "Bascov", "IT", 500);
//			Detail detail = new Detail("Paris", "38720754", "bascov@mail.ru");
//
//			employee2.setEmpDetail(detail);
//			session.save(employee2);

			//Step 2
//			Employee2 employee2 = new Employee2("Alex", "Miron", "IT", 1400);
//			Detail detail = new Detail("Moscow", "83957208", "miron@mail.ru");
//			employee2.setEmpDetail(detail);
//			session.save(employee2);

			//Step 3
//			Employee2 emp = session.get(Employee2.class, 1);
//			System.out.println(emp.getEmpDetail());

			//Step 4
			Employee2 emp = session.get(Employee2.class, 2);
			session.delete(emp);

		} finally {
			session.getTransaction().commit();
			factory.close();
		}
	}
}
