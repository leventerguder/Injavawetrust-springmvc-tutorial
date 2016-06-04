package _02_01.beanNameUrlHandlerMapping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Page2Controller extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView modelAndView = new ModelAndView("02.01.beanNameHandlerMapping.view/myPage2");
		modelAndView.addObject("message", "Hello Page2");
		return modelAndView;
	}

}
