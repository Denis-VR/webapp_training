package mvc.xml_config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class CheckinController {

	@RequestMapping("/askDetails")
	public String askEmployeeDetails(Model model) {
		model.addAttribute("employee", new Employee());


		return "checkin_ask";
	}

	@RequestMapping("/showDetails")
	public String showEmpDetails(@ModelAttribute("employee") Employee employee) {


		return "checkin_show";
	}


}
