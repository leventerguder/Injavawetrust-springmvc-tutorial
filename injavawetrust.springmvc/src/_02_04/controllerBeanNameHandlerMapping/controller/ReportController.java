package _02_04.controllerBeanNameHandlerMapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ReportController extends AbstractController {

	@Override
	// http://localhost:8080/injavawetrust.springmvc/report
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("02.04.controllerBeanNameHandlerMapping.view/myReportPage");
		modelAndView.addObject("message", "Hello ReportPage");
		return modelAndView;
	}

}