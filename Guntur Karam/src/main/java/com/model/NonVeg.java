package com.model;

public class NonVeg {
	private int non_veg_id;
	public int getNon_veg_id() {
		return non_veg_id;
	}
	public void setNon_veg_id(int non_veg_id) {
		this.non_veg_id = non_veg_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	private String name;
	private String price;
}
