package _07.more.requestMapping.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import _07.more.requestMapping.domain.Product;

public interface ProductRepositoryDAO {

	List<Product> getAllProducts();

	Product getProductById(String productID);

	List<Product> getProductsByCategory(String category);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	void addProduct(Product product);
}
