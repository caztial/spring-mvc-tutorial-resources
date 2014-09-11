package mvctest.service;

import java.io.Serializable;
import java.util.List;
import mvctest.domain.Product;


public interface ProductManager extends Serializable {
	
	public void increasePrice(int precentage);
	
	public List<Product> getProducts();
}
