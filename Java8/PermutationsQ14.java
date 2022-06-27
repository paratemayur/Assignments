package com.yash.lambdaExpression;

import java.util.Scanner;

public class PermutationsQ14 {
	
	    public static void main(String[] args) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter any alphabetical");
	        String str = sc.next(); 
	        int n = str.length(); 
	        PermutationsQ14 permutation = new PermutationsQ14(); 
	        permutation.permute(str, 0, n-1); 
	    } 
	  
	    private void permute(String str, int s, int e) 
	    { 
	        if (s == e) 
	            System.out.println(str); 
	        else
	        { 
	            for (int i = s; i <= e; i++) 
	            { 
	                str = swap(str,s,i); 
	                permute(str, s+1, e); 
	                str = swap(str,s,i); 
	            } 
	        } 
	    } 
	    public String swap(String s, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = s.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	  

}
