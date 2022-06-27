package com.yash.lambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateOrNotQ8 {
 
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter number :");
    	int num = sc.nextInt();
        Predicate<Integer> p = number -> (number % 2 == 0);
		
        if(p.test(num)) {
        	System.out.println(num+ " is even number");
        }else {
			System.out.println(num + " is odd number");
		}
    }
}