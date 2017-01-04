package _06.requestMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/pathVariable/{customerId}")
	// http://localhost:8080/injavawetrust.springmvc/customer/pathVariable/100
	public String getCustomerById(@PathVariable("customerId") String customerId, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerById is called.");
		model.addAttribute("message2", "Customer Id : " + customerId);
		return "06.requestMapping.view/customer";
	}

	@RequestMapping("/reqeustParam")
	// http://localhost:8080/injavawetrust.springmvc/customer/reqeustParam?name=Levent
	public String getCustomerByName(@RequestParam("name") String customerName, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByName is called.");
		model.addAttribute("message2", "Customer Name : " + customerName);
		return "06.requestMapping.view/customer";
	}

	@RequestMapping("/reqeustParam2")
	// http://localhost:8080/injavawetrust.springmvc/customer/reqeustParam2?name=Levent&surname=Erguder
	public String getCustomerByNameAndSurname(@RequestParam("name") String customerName,
			@RequestParam("surname") String customerSurname, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByNameAndSurname is called.");
		model.addAttribute("message2", "Customer Information: " + customerName + " " + customerSurname);
		return "06.requestMapping.view/customer";
	}
	
//	@RequestMapping("/matrixParam/{phoneNumber}")
//	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam
//	public String getCustomerByFilter(@MatrixVariable("phoneNumber") String phoneNumber,
//			@MatrixVariable("city") String city, Model model) {
//		model.addAttribute("message1", "CustomerController#getCustomerByNameAndSurname is called.");
//		model.addAttribute("message2", "Customer Information: " + phoneNumber + " " + city);
//		return "06.requestMapping.view/customer";
//	}
//	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam
//	public String getCustomerByFilter(@MatrixVariable("gender") String gender,
//			@MatrixVariable("city") String city, Model model) {
//		model.addAttribute("message1", "CustomerController#getCustomerByNameAndSurname is called.");
//		model.addAttribute("message2", "Customer Information: " + gender + " " + city);
//		return "06.requestMapping.view/customer";
//	}
	
//	@RequestMapping(value = "/reports/{reportId}")
//	public String findReport(@PathVariable String reportId, @MatrixVariable int q,Model model) {
//		
//		model.addAttribute("message1", "CustomerController#getCustomerByNameAndSurname is called.");
//		model.addAttribute("message2", "Customer Information: " + reportId + " " + q);
//		return "06.requestMapping.view/customer";
//	}
	
//	@RequestMapping(value = "/reports/{phoneNumber}")
//	public String findReport(@MatrixVariable("phoneNumber") String phoneNumber,Model model) {
//		
//		model.addAttribute("message1", "CustomerController#findReport is called.");
//		model.addAttribute("message2", "Customer Information: " + phoneNumber );
//		return "06.requestMapping.view/customer";
//	}
	
	@RequestMapping(value = "/reports")
	public String findReport(@MatrixVariable("phoneNumber") String phoneNumber,Model model) {
		
		model.addAttribute("message1", "CustomerController#findReport is called.");
		model.addAttribute("message2", "Customer Information: " + phoneNumber );
		return "06.requestMapping.view/customer";
	}
}
