package mvc.xml_config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	//метод возвращает имя view. Благодаря конфигурации в applicationContext.xml к имени
	//добавиться путь "/WEB-INF/view/" и расширение ".jsp"
	@RequestMapping("/")
	public String showFirstView() {
		return "myView";
	}

	@RequestMapping("askDetails")
	public String askEmployeeDetails() {
		return "ask-emp-details-view";
	}

	@RequestMapping("showDetails")
	public String showEmpDetails() {
		return "show-emp-details-view";
	}
}
