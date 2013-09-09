package com.naiyi.designpattern.visitor.item;

import com.naiyi.designpattern.visitor.Visitor;

public class Laptop implements Item {
    private double price;
    private double discount;
    private String brand;
    
    public Laptop(double price, double discount, String brand) {
    	this.price = price;
    	this.discount = discount;
    	this.brand = brand;
    }

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
