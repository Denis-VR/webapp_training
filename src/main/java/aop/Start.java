package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		context.getBean("libBean", Lib.class).go(4,5);
		context.getBean("libBean", Lib.class).getBook();
	}
}
