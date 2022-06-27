package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarksQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 5; i++) {
			int c = sc.nextInt();
			list.add(c);
		}
				for (int d : list) {
			System.out.println(d);
		}
		Double avg = list.stream().collect(Collectors.averagingDouble(e->e));
		System.out.println(avg);
	}
}
