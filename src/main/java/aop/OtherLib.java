package aop;

import org.springframework.stereotype.Component;

@Component("otherLib")
public class OtherLib {
	public void getBook() {
		System.out.println("Вызван метод getBook класса OtherLib");
	}

	public void returnBook() {
		System.out.println("Вызван метод returnBook класса OtherLib");
	}
}
