package _12.validation.jsr349.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import _12.validation.jsr349.domain.Product;
import _12.validation.jsr349.service.ProductService;


@Controller
@RequestMapping("/products/management")
public class ProductManagementController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	// http://localhost:8080/injavawetrust.springmvc/products/management/add
	public String getNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		newProduct.setDescription("default description");
		newProduct.setCondition("new");
		newProduct.setCategory("Tablet");
		newProduct.setManufacturer("Samsung");
		return "12.validation.jsr349.view/productAdd";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") @Valid Product productToBeAdded, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "12.validation.jsr349.view/productAdd";
		}

		productService.addProduct(productToBeAdded);
		return "redirect:/products";
	}

	// referenceData
	@ModelAttribute("manufacturerList")
	public List<String> prepareManufacturerList() {
		return Arrays.asList("Apple", "Google", "Samsung");
	}

	// referenceData
	@ModelAttribute("categoryList")
	public List<String> prepareCategoryList() {
		return Arrays.asList("Laptop", "Tablet", "SmartPhone");
	}

	// referenceData
	@ModelAttribute("conditionMap")
	public Map<String, String> prepareConditionMap() {
		Map<String, String> conditions = new HashMap<String, String>();
		conditions.put("new", "New");
		conditions.put("old", "Old");
		conditions.put("refurbished", "Refurbished");
		return conditions;
	}
}
