package _10.external.textMessage.dao;

import java.util.List;

import _10.external.textMessage.domain.Product;


public interface ProductRepositoryDAO {

	public List<Product> getAllProducts();

	public Product getProductById(String productID);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);

	public void addProduct(Product product);
}
