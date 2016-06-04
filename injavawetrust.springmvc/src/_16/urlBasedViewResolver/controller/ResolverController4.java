package _16.urlBasedViewResolver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResolverController4 {

	@RequestMapping("/page7")
	public ModelAndView handleViewResolverForPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page7");
		modelAndView.setViewName("16.urlBasedViewResolver.view/myPage7");
		return modelAndView;
	}

	@RequestMapping("/page8")
	public ModelAndView handleViewResolverForPage6() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "page8");
		modelAndView.setViewName("16.urlBasedViewResolver.view/myPage8");
		return modelAndView;
	}
}
