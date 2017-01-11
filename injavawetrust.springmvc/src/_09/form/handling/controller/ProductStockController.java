package _09.form.handling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import _09.form.handling.service.ProductService;

@Controller
@RequestMapping("/stocks")
public class ProductStockController {

	@Autowired
	private ProductService productService;
}
