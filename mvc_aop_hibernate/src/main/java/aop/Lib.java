package aop;

import org.springframework.stereotype.Component;

@Component("libBean")
public class Lib {
	public void getBook() {
		System.out.println("Вызван метод getBook класса Lib");
	}

	public void go(int i, int b) {
		getBook();
		new OtherLib().getBook();
	}
}
