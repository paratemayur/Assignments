package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpNameUniqueQ3 {

	public static void main(String[] args) {
		
	
	List<String> elist = new ArrayList<String>();
	
	elist.add("Mayur");
	elist.add("Akshay");
	elist.add("Mayur");
	elist.add("Nikhil");
	elist.add("Ashish");
	
	List<String> list = elist.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(list);
	}
		
}
