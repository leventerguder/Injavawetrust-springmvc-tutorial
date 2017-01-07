package _07.uri.arguments.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// @PathVariable
	// @RequestParam
	// @MatrixVariable

	@RequestMapping("/pathVariable/{customerId}")
	// http://localhost:8080/injavawetrust.springmvc/customer/pathVariable/100
	public String getCustomerById(@PathVariable("customerId") String customerId, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerById is called.");
		model.addAttribute("message2", "Customer Id : " + customerId);
		return "07.uri.arguments.view/customer";
	}

	@RequestMapping("/pathVariable2/{day}/{month}/{year}")
	// http://localhost:8080/injavawetrust.springmvc/customer/pathVariable2/18/06/1989
	public String getCustomersByBirthDate(@PathVariable("day") int day, @PathVariable("month") int month,
			@PathVariable("year") int year, Model model) {
		LocalDate date = LocalDate.of(year, month, day);
		model.addAttribute("message1", "CustomerController#getCustomersByBirthDate is called.");
		model.addAttribute("message2", "Customer BirthDate : " + date);
		return "07.uri.arguments.view/customer";
	}

	@RequestMapping("/reqeustParam")
	// http://localhost:8080/injavawetrust.springmvc/customer/reqeustParam?name=Levent
	public String getCustomerByName(@RequestParam("name") String customerName, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByName is called.");
		model.addAttribute("message2", "Customer Name : " + customerName);
		return "07.uri.arguments.view/customer";
	}

	@RequestMapping("/reqeustParam2")
	// http://localhost:8080/injavawetrust.springmvc/customer/reqeustParam2?name=Levent&surname=Erguder
	public String getCustomerByNameAndSurname(@RequestParam("name") String customerName,
			@RequestParam("surname") String customerSurname, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByNameAndSurname is called.");
		model.addAttribute("message2", "Customer Information: " + customerName + " " + customerSurname);
		return "07.uri.arguments.view/customer";
	}

	@RequestMapping("/matrixParam/{filter}")
	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam/phoneNumber=555
	public String getCustomerByFilter1(@MatrixVariable(pathVar = "filter") String phoneNumber, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByFilter1 is called.");
		model.addAttribute("message2", "Customer PhoneNumber: " + phoneNumber);
		return "07.uri.arguments.view/customer";
	}

	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam2/gender=male;city=istanbul
	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam2/gender=male;city=istanbul,ankara,izmir
	@RequestMapping("/matrixParam2/{filter}")
	public String getCustomerByFilter2(@MatrixVariable(pathVar = "filter") String gender,
			@MatrixVariable(pathVar = "filter") List<String> city, Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByFilter2 is called.");
		model.addAttribute("message2", "Customer Information: " + gender + " " + city);
		return "07.uri.arguments.view/customer";
	}

	@RequestMapping("/matrixParam3/{filter}")
	// http://localhost:8080/injavawetrust.springmvc/customer/matrixParam3/gender=male;city=istanbul,ankara,izmir
	public String getCustomerByFilter3(@MatrixVariable(pathVar = "filter") Map<String, List<String>> matrixVariables,
			Model model) {
		model.addAttribute("message1", "CustomerController#getCustomerByFilter3 is called.");
		model.addAttribute("message2", "Customer Information: " + matrixVariables);
		return "07.uri.arguments.view/customer";
	}

}
