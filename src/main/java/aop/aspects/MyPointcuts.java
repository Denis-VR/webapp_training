package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
//	@Pointcut("execution(* add*(..))")
	//делаем этот pointcut недействительным, чтобы не засорять вывод в консоль
@Pointcut("execution(* ads*(..))")
public void allAddMethods() {}
}
