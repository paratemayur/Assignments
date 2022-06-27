package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarksQ2 {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(75, 79, 86, 90, 95, 75, 90, 95);
		List<Integer> dm = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(dm);
	}
}
