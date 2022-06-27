package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNoArrayQ4 {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(76,67,87,78,98,89);
		//Integer i = list.stream().max(Integer::compare).get();
		//System.out.println("Max num from list : "+i);
		Integer i1 = list.stream().max((n1, n2)->n1.intValue() > n2.intValue()?1 : -1).get();
	
		System.out.println("Maximum number is : "+i1);
	}
}