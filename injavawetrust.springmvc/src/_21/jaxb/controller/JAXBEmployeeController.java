package _21.jaxb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import _21.jaxb.model.Employee;
import _21.jaxb.model.EmployeeList;

@Controller
public class JAXBEmployeeController {

	@RequestMapping("/getEmployeeXML")
	public ModelAndView getEmployeeXML() {
		ModelAndView mv = new ModelAndView("marshallingView");
		mv.addObject(new Employee("1", "Levent", "Erguder", "1989"));
		return mv;
	}

	@RequestMapping("/getEmployeeListXML")
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