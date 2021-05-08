package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {
	public static void main(String[] args) {
		System.out.println("Method main start!!!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		OtherLib lib = context.getBean("otherLib", OtherLib.class);
		String bookName = lib.returnBook();
		System.out.println("В библиотеку вернули книгу " + bookName);

		context.close();
		System.out.println("Method main ends!!!");
	}
}
