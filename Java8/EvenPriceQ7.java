package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Items{
	String iname;
	double price;
	
	public Items(String iname, double price) {
		super();
		this.iname = iname;
		this.price = price;
	}
}
public class EvenPriceQ7 {

	public static void main(String[] args) {
List<Items> list = new ArrayList<>();
		
		list.add(new Items("Laptop", 60000));
		list.add(new Items("Mouse", 1201));
		list.add(new Items("Keyboard", 1500));
		
		//List<Float> priceEven = list.stream().filter(i -> i.price % 2 == 0).map(i -> i.getPrice()).toList();
	
		List<Double> priceeven=list.stream().filter(i->i.price%2==0).map(i->i.price).collect(Collectors.toList());
		
		System.out.println("Even number are : "+priceeven);
	}
}
