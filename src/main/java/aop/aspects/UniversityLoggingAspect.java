package aop.aspects;


import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
	@Before("execution(* getStudents())")
	public void beforeGetStudentsLoggingAdvice() {
		System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка " +
				"студентов перед методом getStudents");
	}


	//можем явно указать в аргументе аннотации, что это advice
//	@AfterReturning(pointcut = "execution(* getStudents())")
//	public void afterReturningGetStudentsLoggingAdvice() {
//
//		System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка " +
//				"студентов после нормального выполнения метода getStudents");
//	}

	//попробуем изменить результат
	//метод getStudents вовращает List<Student>, указываем это в аргументе advice-метода, и название
	// этого аргумента помещаем во 2 параметр @AfterReturning(..., returning = "Arg_Name")
	@AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
	public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
		Student st1 = students.get(0);

		String nameSurname = st1.getNameSurname();
		nameSurname = "Mr. " + nameSurname;
		st1.setNameSurname(nameSurname);

		double adgGrade = st1.getAvgGrade();
		adgGrade = adgGrade + 1;
		st1.setAvgGrade(adgGrade);

		System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка " +
				"студентов после нормального выполнения метода getStudents");
	}
}
