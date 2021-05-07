package mvc.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//указываем, для какой аннотации этот обработчик, и какого типа должны быть поля, к которым будет применяться аннотация
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
	private String endOfEmail;

	//получаем доступ к концовке введенного пользователем email
	@Override
	public void initialize(CheckEmail checkEmail) {
		endOfEmail = checkEmail.value();
	}

	//проверяем, соответсвует ли концовка введенного email нашему значению value
	@Override
	public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
		return enteredValue.endsWith(endOfEmail);
	}
}
