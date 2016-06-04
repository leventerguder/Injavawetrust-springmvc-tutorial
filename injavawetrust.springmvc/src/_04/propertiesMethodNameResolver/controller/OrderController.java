package _04.propertiesMethodNameResolver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// public class MultiActionController extends AbstractController implements
// LastModified { ...}
public class OrderController extends MultiActionController {

	// public (ModelAndView | Map | String | void) actionName(HttpServletRequest
	// request, HttpServletResponse response, [,HttpSession] [,AnyObject]);

	public String add(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "add method");
		return "04.propertiesMethodNameResolver.view/add";
	}
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("04.propertiesMethodNameResolver.view/remove");
		modelAndView.addObject("message", "remove method");
		return modelAndView;
	}

	public ModelAndView list(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView) {
		modelAndView.setViewName("04.propertiesMethodNameResolver.view/list");
		modelAndView.addObject("message", "list method");
		return modelAndView;
	}
}
