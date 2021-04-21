package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
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

	@Pointcut("execution(* get*())")
	private void allGetMethods() {}

	@Before("allGetMethods()")
	public void beforeGetLoggingAdvice() {
		System.out.println("beforeGetLoggingAdvice: попытка получить книгу");
	}


}
