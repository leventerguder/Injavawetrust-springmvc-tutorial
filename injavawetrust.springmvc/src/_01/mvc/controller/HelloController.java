package _01.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import _01.mvc.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	// we are using context:component-scan.
	// we don't need setter method for @Autowired.

	// setter injection'ini kendimiz yapmak yerine , context:component-scan
	// tag'ini kullaniyoruz.
	// @Autowired icin setter metoduna ihtiyacimiz yoktur.

	// public void setHelloService(HelloService helloService) {
	// this.helloService = helloService;
	// }

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHelloSpringMVC(ModelMap model) {
		String message = helloService.getMessage();
		model.addAttribute("message", message);
		return "01.hello.springmvc.view/hello";

	}

}
