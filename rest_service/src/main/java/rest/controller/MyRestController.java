package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.entity.Employee;
import rest.exception_handing.EmployeeIncorrectData;
import rest.exception_handing.NoSuchEmployeeException;
import rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> showAllEmployees() {
		List<Employee> allEmployees = employeeService.getAllEmployees();

		return allEmployees;
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee employee = employeeService.getEmployee(id);

		if (employee == null) {
			throw new NoSuchEmployeeException("There is no employee " +
					"with ID = " + id + " in Database.");
		}
		return employee;
	}

	@PostMapping("/employees")
	public Employee addNewEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {

		employeeService.saveEmployee(employee);
		return employee;
	}

//	@DeleteMapping("/employees/{id}")
//	public ResponseEntity<EmployeeIncorrectData> deleteEmployee(@PathVariable int id) {
//		employeeService.deleteEmployee(id);
//		return new ResponseEntity<>(new EmployeeIncorrectData("Employee with ID = " + id + " was deleted"), HttpStatus.OK);
//	}
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		if (employeeService.getEmployee(id) == null) {
			throw new NoSuchEmployeeException("There is no employee with id = " + id + " in Database");
		}

		employeeService.deleteEmployee(id);
		return "Employee with ID = " + id + " was deleted";
	}
}
