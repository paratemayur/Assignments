package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemQ6 {

	int id;
	String iname;
	double price;
	 ItemQ6(int id,String iname, double price) {
		super();
		this.id = id;
		this.iname = iname;
		this.price = price;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

class TestItemQ6 {

	public static void main(String[] args) {
		List<ItemQ6> list = new ArrayList<ItemQ6>();
		
		list.add(new ItemQ6(1,"Laptop", 60000));
		list.add(new ItemQ6(2,"Mouse", 1200));
		list.add(new ItemQ6(3,"Keyboard", 1500));
		
		Double avg = list.stream().collect(Collectors.averagingDouble(i -> i.price));
		
		System.out.println("Average price is : "+avg);
		
		//List<ItemQ6> priceLTAvgPrice = list.stream().filter(i1 -> i1.price < avg).map(i1 -> i1).toList();
		List<ItemQ6> price = list.stream().filter(i1 -> i1.price <avg).map(i1 -> i1).collect(Collectors.toList());
		System.out.println("==============================");
		System.out.println("show record price is less than average price");
		for (ItemQ6 i : price) {
			System.out.println(i.iname+" "+i.price);
		}
	}
}

