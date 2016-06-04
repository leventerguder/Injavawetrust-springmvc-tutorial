package _07.more.requestMapping.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import _07.more.requestMapping.domain.Product;
import _07.more.requestMapping.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "07.more.requestMapping.view/productList";
	}

	@RequestMapping("/all")
	public ModelAndView allProducts() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("products", productService.getAllProducts());
		modelAndView.setViewName("07.more.requestMapping.view/productList");
		return modelAndView;
	}

	@RequestMapping("/{category}")
	public String getProductsByCategory(@PathVariable("category") String productCategory, Model model) {
		model.addAttribute("products", productService.getProductsByCategory(productCategory));
		return "07.more.requestMapping.view/productList";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam("id") String productId, Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "07.more.requestMapping.view/productDetail";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams,
			Model model) {
		model.addAttribute("products", productService.getProductsByFilter(filterParams));
		return "07.more.requestMapping.view/productList";
	}

	// referenceData
	@ModelAttribute("manufacturerList")
	public List<String> prepareManufacturerList() {
		List<String> manufactures = new ArrayList<String>();
		manufactures.add("Apple");
		manufactures.add("Google");
		manufactures.add("Samsung");
		return manufactures;
	}

	@ModelAttribute("categoryList")
	public List<String> prepareCategoryList() {
		List<String> categories = new ArrayList<String>();
		categories.add("Laptop");
		categories.add("Tablet");
		categories.add("Smart Phone");
		return categories;
	}

	//
	@ModelAttribute("conditionMap")
	public Map<String, String> prepareConditionMap() {
		Map<String, String> conditions = new HashMap<String, String>();
		conditions.put("new", "New");
		conditions.put("old", "Old");
		conditions.put("refurbished", "Refurbished");
		return conditions;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		newProduct.setDescription("default description");
		newProduct.setCondition("new");
		newProduct.setCategory("Tablet");
		newProduct.setManufacturer("");
		return "07.more.requestMapping.view/addProduct";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product productToBeAdded) {
		productService.addProduct(productToBeAdded);
		return "redirect:/products";
	}

}
