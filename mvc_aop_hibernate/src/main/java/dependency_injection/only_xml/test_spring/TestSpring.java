package dependency_injection.only_xml.test_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test_spring.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		System.out.println(testBean.getName());
	}
}
