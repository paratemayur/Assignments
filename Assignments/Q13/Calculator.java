package com.yash.tdd.Assignments.Q13;

import java.util.Scanner;

public class Calculator {

	//add
	public static int add(int a , int b) {
		System.out.println(a+b);
		return a+b;	
	}	
	//sub
	public static int sub(int a , int b) {
		System.out.println(a-b);
		return a-b;	
	}
	//mul
	public static int mul(int a , int b) {
		System.out.println(a*b);
		return a*b;	
	}
	//div
	public static int div(int a , int b) {
		int result = 0;
		try {
			result = a/b;
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Invalid divisor : can not be divided by zero "+ e);
		}
		return a/b;	
	}
	public static int mod(int a, int b) {
	    System.out.println(a%b);
		return a%b;
	}
	static double power(int N, int P)
    {
		if (N > 0 && P > 0) {
			System.out.println("done");
			System.out.println(Math.pow(N, P));
			 return Math.pow(N, P);
		}else {
			System.out.println("dhdh");
			System.out.println(Math.pow(N, P));
			return Math.pow(N, P);
		}    
    }
	static double sqrt(int a)
    {
		System.out.println(Math.sqrt(a));
        return Math.sqrt(a);
    }
	static double cube(int a)
    {
        return Math.cbrt(a);
    }
	
	public static void main(String[] args) {
//		Calculator.add(12, 12);
//		Calculator.sub(1, 12);
//		Calculator.mul(12, 12);
//		Calculator.div(15, 0);
//		Calculator.mod(60, 11);
//      Calculator.power(3, 3);
//      Calculator.sqrt(9);
        
	}
}
