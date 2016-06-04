package _09.validation.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _09.validation.dao.ProductRepositoryDAO;
import _09.validation.domain.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepositoryDAO productRepository;

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}
	
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}

	public void addProduct(Product product) {
		   productRepository.addProduct(product);
	}
}
