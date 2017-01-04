package _02_02.simpleUrlHandlerMapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController {

	@Override
	// http://localhost:8080/injavawetrust.springmvc/login
	// http://localhost:8080/injavawetrust.springmvc/index
	// http://localhost:8080/injavawetrust.springmvc/welcome
	// http://localhost:8080/injavawetrust.springmvc/guest
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("02.02.simpleUrlHandlerMapping.view/myLoginPage");
		modelAndView.addObject("message", "Hello Login Page");
		return modelAndView;
	}

}