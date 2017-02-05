package _18.internalResourceViewResolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResolverController3 {

	@RequestMapping("/page5")
	// http://localhost:8080/injavawetrust.springmvc/page5
	public ModelAndView handleViewResolverForPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page5");
		modelAndView.setViewName("18.internalResourceViewResolver.view/myPage5");
		return modelAndView;
	}

	@RequestMapping("/page6")
	// http://localhost:8080/injavawetrust.springmvc/page5
	public ModelAndView handleViewResolverForPage6() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page6");
		modelAndView.setViewName("18.internalResourceViewResolver.view/myPage6");
		return modelAndView;
	}
}
