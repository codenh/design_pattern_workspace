package com.naiyi.designpattern.visitor.item;

import com.naiyi.designpattern.visitor.Visitor;

public class Desktop implements Item {
    private double price;
    private String brand;
    
    public Desktop(double price, String brand) {
    	this.price = price;
    	this.brand = brand;
    }

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
