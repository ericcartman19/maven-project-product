package com.valoyes.product.dto;

/**
 * 
 * DTO = Data Exchange Object
 * se va a utilizar en el intercambio de informacion entre 
 * el User Interface and the Service Layer, basicamente a Model Object
 * 
 * @author benito
 *
 */
public class Product {
	
	private int id;
	private String name;
	private String description;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
