package _17.resourceBundleViewResolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResolverController2 {

	@RequestMapping("/page3")
	public ModelAndView handleViewResolverForPage3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page3");
		modelAndView.setViewName("myBeanViewNamePage3");
		return modelAndView;
	}

	@RequestMapping("/page4")
	public ModelAndView handleViewResolverForPage4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page4");
		modelAndView.setViewName("myBeanViewNamePage4");
		return modelAndView;
	}
}
