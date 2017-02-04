package _16.xmlViewResolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResolverController {

	@RequestMapping("/page1")
	public ModelAndView handleViewResolverForPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page1");
		modelAndView.setViewName("myBeanViewNamePage1");
		return modelAndView;
	}
	
	@RequestMapping("/page2")
	public ModelAndView handleViewResolverForPage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page2");
		modelAndView.setViewName("myBeanViewNamePage2");
		return modelAndView;
	}
}
