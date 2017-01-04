package _03.multiActionController.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// public class MultiActionController extends AbstractController implements
// LastModified { ...}
@SuppressWarnings("deprecation")
public class OrderController extends MultiActionController {

	// public (ModelAndView | Map | String | void) actionName(HttpServletRequest
	// request, HttpServletResponse response, [,HttpSession] [,AnyObject]);

	// http://localhost:8080/injavawetrust.springmvc/order/add
	public String add(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "add method");
		return "03.multiActionController.view/add";
	}

	// http://localhost:8080/injavawetrust.springmvc/order/remove
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("03.multiActionController.view/remove");
		modelAndView.addObject("message", "remove method");
		return modelAndView;
	}

	// http://localhost:8080/injavawetrust.springmvc/order/list
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView) {
		modelAndView.setViewName("03.multiActionController.view/list");
		modelAndView.addObject("message", "list method");
		return modelAndView;
	}

	// org.springframework.web.servlet.mvc.multiaction.InternalPathMethodNameResolver
	// prefix and suffix
	// http://localhost:8080/injavawetrust.springmvc/order/prefix
	public String myprefixMethod(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "myprefixMethod");
		return "03.multiActionController.view/add";
	}
}
