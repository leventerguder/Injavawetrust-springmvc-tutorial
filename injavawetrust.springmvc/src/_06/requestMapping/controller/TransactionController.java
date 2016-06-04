package _06.requestMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransactionController {

	@RequestMapping(value = "/getInfo/{id}")
	public String getTransactionInfo(@PathVariable("id") String id) {
		System.out.println("id : " + id);
		return "06.requestMapping.view/addOrder";
	}

	@RequestMapping(value = "/getInfo2")
	public String getTransactionInfo2(@RequestParam("id") String id) {
		System.out.println("id : " + id);
		return "06.requestMapping.view/addOrder";
	}
}
