package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

// @Controller
// @ResponseBody // use @ResponseBody annotation for JSON response.

// or @RestController

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping
	public List<Employee> getAllEmployees() {
		return employeeService.inMemoryData();
	}

	@RequestMapping(value = "/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		// return employeeService.inMemoryData().stream().filter(e -> e.getId() ==
		// id).findFirst().get();

		for (Employee e : employeeService.inMemoryData()) {
			if (e.getId() == id) {
				return e;
			}
		}
		throw new RuntimeException("Not Found");
	}

}
