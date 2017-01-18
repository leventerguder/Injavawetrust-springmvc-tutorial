package _11.validation.service;

import java.util.List;

import _11.validation.domain.Product;


public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(String productID);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);
	
	public void addProduct(Product product);
}
