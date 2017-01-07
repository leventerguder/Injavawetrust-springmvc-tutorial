package _06.requestMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(method = { RequestMethod.GET })
	// http://localhost:8080/injavawetrust.springmvc/test
	public String testMethod(Model model) {
		model.addAttribute("message", "testMethod...");
		return "06.requestMapping.view/testPage";
	}

	@RequestMapping(method = { RequestMethod.GET }, value = "/test2")
	// http://localhost:8080/injavawetrust.springmvc/test/test2
	public String testMethodWithValue(Model model) {
		model.addAttribute("message", "testMethodWithValue...");
		return "06.requestMapping.view/testPage";
	}

}
