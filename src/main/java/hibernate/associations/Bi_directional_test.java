package hibernate.associations;

import hibernate.associations.entity.Detail;
import hibernate.associations.entity.Employee2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Bi_directional_test {
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

		} finally {
			session.getTransaction().commit();
			factory.close();
		}
	}
}
