package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public interface FindMaxQ12 {

	void maxArray(int a[]);
}
class MaxOf5NoQ12 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		FindMaxQ12 u = (int a[])->{
			for (int i = 1; i < a.length; i++) {
				list.add(a[i]);
			}
			Integer Max = list.stream().max((u1 , u2) -> u1 > u2 ? 1 : -1).get();
			System.out.println("Maximum number in array : "+Max);
		};
		u.maxArray(new int[] {100,150,500,200,250});
	}
}