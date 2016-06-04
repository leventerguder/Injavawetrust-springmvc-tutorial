package _06.requestMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("message", "add() method");
		return "06.requestMapping.view/addOrder";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		modelMap.addAttribute("message", "list() method");
		return "06.requestMapping.view/getOrderList";
	}

	@RequestMapping(value = {"/remove", "/delete"}, method = RequestMethod.GET)
	public ModelAndView remove() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("06.requestMapping.view/removeOrder");
		mv.addObject("message", "remove() method");
		return mv;
	}
}
