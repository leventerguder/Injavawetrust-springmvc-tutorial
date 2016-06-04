package _02_03.controllerClassNameHandlerMapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CustomerTransactionController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("02.03.controllerClassNameHandlerMapping.view/myTransactionPage");
		modelAndView.addObject("message", "Hello TransactionPage");
		return modelAndView;
	}

}