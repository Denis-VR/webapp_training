package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {
//	@Pointcut("execution(public void getBook())")
//	private void pointcut_ref() {}
//
//	@Before("pointcut_ref()")
//	public void beforeGetBookAdvice() {
//		System.out.println("попытка получить книгу");
//	}
//
//	@Before("execution(public void *(*,*))")
//	public void methodWithTwoArg() {
//		System.out.println("Вызван эдвайс для метода с двумя аргументами.");
//	}
//
//	@Pointcut("execution(* aop.OtherLib.get*())")
//	private void allGetMethodsFromUniLibrary() {}
//
//	@Pointcut("execution(* aop.OtherLib.return*())")
//	private void allReturnMethodsFromUniLibrary() {}
//
//	@Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//	private void allGetAndReturnMethodsFromUniLibrary() {}

	@Before("aop.aspects.MyPointcuts.allAddMethods()")
	public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("methodSignature = " + methodSignature);
		System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
		System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
		System.out.println("methodSignature.getName() = " + methodSignature.getName());

		//Для метода addBook выводим ифнмормацию о парамтерах
		if (methodSignature.getName().equals("addBook")) {
			Object[] args = joinPoint.getArgs();
			for (Object o :args) {
				//если аргумент - это книга
				if(o instanceof Book) {
					Book myBook = (Book) o;
					System.out.println("Информация о книге: \nназвание - " +
							myBook.getName() + "\nавтор - " + myBook.getAuthor()
					+ "\nгод издания - " + myBook.getYearOfPublication());
				}
				//если аргумент - строка (имя автора)
				else if(o instanceof String) {
					System.out.println("Книгу в библиотеку добавляет " + o);
				}
			}
		}
	}


}
