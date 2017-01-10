package _08.webstore.dao;

import java.util.List;
import _08.webstore.domain.Product;

public interface ProductRepositoryDAO {

	public List<Product> getAllProducts();

	public Product getProductById(String productID);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);
}
