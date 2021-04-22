package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		University university = context.getBean("university", University.class);
		university.addStudents();

		List<Student> students = university.getStudents();
		System.out.println("----------------");
		System.out.println(students);


		context.close();
	}

}
