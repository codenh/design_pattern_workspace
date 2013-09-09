package com.naiyi.designpattern.visitor;

import com.naiyi.designpattern.visitor.item.Desktop;
import com.naiyi.designpattern.visitor.item.Laptop;

public class AvgPriceVisitor implements Visitor {
    private double total;
    private int size;
	
	@Override
	public void visit(Laptop laptop) {
		size++;
		total += laptop.getPrice() * (1-laptop.getDiscount());
	}

	@Override
	public void visit(Desktop desktop) {
		size++;
		total += desktop.getPrice();
	}
	
	@Override
	public void showResult() {
		System.out.println("The average price of all items is " + total/size);
	}
}
