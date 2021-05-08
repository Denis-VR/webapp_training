package mvc.xml_config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/simple_form")
public class SimpleController {

	//метод возвращает имя view. Благодаря конфигурации в applicationContext.xml к имени
	//добавиться путь "/WEB-INF/view/" и расширение ".jsp"
	@RequestMapping("/")
	public String showFirstView() {
		return "myView";
	}

	@RequestMapping("/askDetails")
	public String askEmployeeDetails() {
		return "simple-ask";
	}

	//простой вывод
//	@RequestMapping("showDetails")
//	public String showEmpDetails() {
//		return "simple-show";
//	}

	//вывод полученной информации
//	@RequestMapping("/showDetails")
//	public String showEmpDetails(HttpServletRequest request, Model model) {
//
//		String empName = request.getParameter("employeeName");
//		empName = "Mr. " + empName;
//		model.addAttribute("nameAttribute", empName);
//
//		model.addAttribute("description", " - instructor");
//
//		return "simple-show";
//	}

	@RequestMapping("/showDetails")
	public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {

		empName = "Mr. " + empName + "!";
		model.addAttribute("nameAttribute", empName);

		model.addAttribute("description", " - instructor");

		return "simple-show";
	}
}
