package com.naiyi.designpattern.visitor.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.naiyi.designpattern.visitor.AvgPriceVisitor;
import com.naiyi.designpattern.visitor.TotalPriceVisitor;
import com.naiyi.designpattern.visitor.Visitor;
import com.naiyi.designpattern.visitor.item.Desktop;
import com.naiyi.designpattern.visitor.item.Item;
import com.naiyi.designpattern.visitor.item.Laptop;

public class TestVisitor {
    public static void main(String[] args) {
    	List<Item> inventory = new LinkedList<Item>(Arrays.asList(
    			  new Laptop(1000.0, 0.2, "Asus"),
			      new Laptop(1300.0, 0.1, "Apple"),
			      new Desktop(700, "Dell"),
			      new Laptop(600.0, 0.3, "Dell"),
			      new Desktop(300, "IBM")));
    	Visitor avgVisitor = new AvgPriceVisitor();
    	Visitor totalVisitor = new TotalPriceVisitor();
    	for (Item item : inventory) {
    		item.accept(avgVisitor);
    		item.accept(totalVisitor);
    	}
    	avgVisitor.showResult();
    	totalVisitor.showResult();
    }
}
