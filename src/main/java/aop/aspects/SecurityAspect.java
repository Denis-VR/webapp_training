package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect {
	@Before("aop.aspects.MyPointcuts.allAddMethods()")
	public void beforeAddSecurityAdvice() {

		System.out.println("beforeGetSecurityAdvice: логирование проверки прав на получение");
		System.out.println("-------------------------");

	}
}
