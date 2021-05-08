package mvc.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//аннотация для валидации email
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

	public String value() default "xyz.com";
	public String message() default "email must ends with xyz.com";

	//следующие два поля необходимо указывать, если вы создаете Spring аннотацию
	//groups позволяет разбивать аннотации по группам
	public Class<?>[] groups() default {};
	//для переноса информации о метаданных клиента
	public Class<? extends Payload> [] payload() default {};
}
