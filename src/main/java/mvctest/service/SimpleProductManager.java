package mvctest.service;

import java.util.List;

import mvctest.domain.Product;

public class SimpleProductManager implements ProductManager{
	
	private List<Product> products;

	public void increasePrice(int precentage) {
		if(this.products!=null){
			for (Product product : products) {
				double priceInDouble= product.getPrice().doubleValue();
				priceInDouble= priceInDouble*(100+precentage)/100;
				product.setPrice(priceInDouble);
			}
		}
	}

	public List<Product> getProducts() {
		return this.products;
	}
	
	public void setProducts(List<Product> products){
		this.products=products;
	}

}
