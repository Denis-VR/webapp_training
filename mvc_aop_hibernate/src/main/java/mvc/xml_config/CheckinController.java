package mvc.xml_config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class CheckinController {

	@RequestMapping("/askDetails")
	public String askEmployeeDetails(Model model) {
		model.addAttribute("employee", new Employee());
		return "checkin_ask";
	}

	@GetMapping("/showDetails")
	public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult result) {
		if (result.hasErrors()) {
			return "checkin_ask";
		}
		else {
			return "checkin_show";
		}
	}

}
