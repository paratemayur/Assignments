package com.yash.lambdaExpression;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class withoutUsingLengthFunctionQ5 {

	public static void main(String[] args) {
		
		String[] str = {"MH", "MP", "UP", "BIHAR", "CG"};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(String s: str) {
			int cnt = 0;
			char [] arr = s.toCharArray();
			for(char ch : arr) {
				cnt++;
			}
			list.add(cnt);
		}
		
		System.out.println(list);
		
		Integer max = list.stream().max((s1,s2)->s1>s2?1:-1).get();
		
		System.out.println(max);
	}
}
