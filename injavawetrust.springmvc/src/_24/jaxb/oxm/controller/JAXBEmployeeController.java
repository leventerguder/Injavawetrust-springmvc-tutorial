package _24.jaxb.oxm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import _24.jaxb.oxm.model.Employee;
import _24.jaxb.oxm.model.EmployeeList;

@Controller
public class JAXBEmployeeController {

	@RequestMapping("/getEmployeeXML")
	// http://localhost:8080/injavawetrust.springmvc/getEmployeeXML
	public ModelAndView getEmployeeXML() {
		ModelAndView mv = new ModelAndView("marshallingView");
		mv.addObject(new Employee("1", "Levent", "Erguder", "1989"));
		return mv;
	}

	@RequestMapping("/getEmployeeListXML")
	// http://localhost:8080/injavawetrust.springmvc/getEmployeeListXML
	public ModelAndView getEmployeeListXML() {
		// prepare data
		Employee employee1 = new Employee("1", "Levent", "Erguder", "1989");
		Employee employee2 = new Employee("2", "James", "Gosling", "1955");
		Employee employee3 = new Employee("3", "Joshua", "Bloch", "1961");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		EmployeeList employeeList = new EmployeeList(employees);

		ModelAndView mv = new ModelAndView("marshallingView");
		mv.addObject(employeeList);
		return mv;
	}
}