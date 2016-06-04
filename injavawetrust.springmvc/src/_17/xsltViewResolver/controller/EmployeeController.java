package _17.xsltViewResolver.controller;

import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/getEmployees")
	public ModelAndView handleEmployeeList(HttpServletRequest request, HttpServletResponse response) {

		InputStream inputStream = request.getServletContext().getResourceAsStream("/resources/xml/employees.xml");
		ModelAndView model = new ModelAndView("17.xsltViewResolver.view/employeeList");
		model.addObject("xmlSource", inputStream);
		return model;
	}
}
