package _06.requestMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/add")
	// http://localhost:8080/injavawetrust.springmvc/order/add
	public String add(Model model) {
		model.addAttribute("message", "OrderController#add");
		return "06.requestMapping.view/addOrder";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	// http://localhost:8080/injavawetrust.springmvc/order/list
	public String list(ModelMap modelMap) {
		modelMap.addAttribute("message", "OrderController#list");
		return "06.requestMapping.view/getOrderList";
	}

	@RequestMapping(value = { "/remove", "/delete" }, method = RequestMethod.GET)
	// http://localhost:8080/injavawetrust.springmvc/order/delete
	// http://localhost:8080/injavawetrust.springmvc/order/remove
	public ModelAndView remove() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("06.requestMapping.view/removeOrder");
		mv.addObject("message", "OrderController#remove");
		return mv;
	}
}
