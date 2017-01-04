package _02_02.simpleUrlHandlerMapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LogoutController extends AbstractController {

	@Override
	// http:// localhost:8080/injavawetrust.springmvc/logout
	// http:// localhost:8080/injavawetrust.springmvc/exit
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("02.02.simpleUrlHandlerMapping.view/myLogoutPage");
		modelAndView.addObject("message", "Hello Logout Page");
		return modelAndView;
	}

}
