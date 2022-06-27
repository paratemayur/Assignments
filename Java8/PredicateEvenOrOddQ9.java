package com.yash.lambdaExpression;

import java.util.function.Predicate;

public class PredicateEvenOrOddQ9 {

	public static void main(String[] args) {
		int arr[] = {5, 10, 15, 20, 25, 30, 35};
		int even=0;
		int odd=0;
		
		Predicate<Integer> p = number ->(number % 2 == 0);
		
		for (int i = 0; i < arr.length-1; i++) {
			if(p.test(arr[i])) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Total even number is : "+even);
		System.out.println("Total odd number is : "+odd);
	}
}
