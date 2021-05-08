package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		context.getBean("libBean", Lib.class).go(4,5);
//		context.getBean("libBean", Lib.class).getBook();
		OtherLib otherLib = context.getBean("otherLib", OtherLib.class);
//		otherLib.getMagazine();
//		otherLib.getBook();
//		otherLib.addBook("Alex", context.getBean("book", Book.class));
		otherLib.addMagazine();

		context.close();
	}
}
