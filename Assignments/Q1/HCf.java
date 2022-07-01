 package com.yash.tdd.Assignments.Q1;

public class HCf {

	public static int findHCF(int a, int b) {
		int hcf = 0;
		int i = 1;
	while (i <= a && i <= b) {
		if(a % i == 0 && b % i == 0)
			hcf = i;
		i++;
	}
		return hcf;	
	}
	public static void main(String[] args) {
		System.out.println(HCf.findHCF(30, 270));
	}
}
