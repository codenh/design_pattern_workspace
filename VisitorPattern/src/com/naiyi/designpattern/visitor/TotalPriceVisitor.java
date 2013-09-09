package com.naiyi.designpattern.visitor;

import com.naiyi.designpattern.visitor.item.Desktop;
import com.naiyi.designpattern.visitor.item.Laptop;

public class TotalPriceVisitor implements Visitor {
    private double total;
	
	@Override
	public void visit(Laptop laptop) {
		total += laptop.getPrice() * (1-laptop.getDiscount()); 
	}

	@Override
	public void visit(Desktop desktop) {
		total += desktop.getPrice();
	}

	@Override
	public void showResult() {
		System.out.println("The total price of all items is " + total);
	}
}
