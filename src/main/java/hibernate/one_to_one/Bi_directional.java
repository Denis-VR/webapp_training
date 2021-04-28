package hibernate.one_to_one;

import hibernate.one_to_one.entity.Detail;
import hibernate.one_to_one.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bi_directional {
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

			//step 1
//			Employee2 employee3 = new Employee2("Idle", "Level", "HR", 850);
//			Detail detail2 = new Detail("New-York", "48305802", "idle@mail.ru");
//			detail2.setEmployee2(employee3);
//			employee3.setEmpDetail(detail2);
//			session.save(detail2);

			//step 2
			Detail detail = session.get(Detail.class, 4);
			System.out.println(detail.getEmployee2());

		} finally {
			session.getTransaction().commit();
			factory.close();
		}
	}
}
