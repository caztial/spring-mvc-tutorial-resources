package mvctest.domain;

import java.io.Serializable;

public class Product implements Serializable{
	private String description;
	private Double price;
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public void setPrice(Double price){
		this.price=price;
	}
	
	public Double getPrice(){
		return this.price;
	}
	
	public String toString(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("Description: "+this.description+";");
		buffer.append("Price: "+this.price+";");
		return buffer.toString();
	}
}
