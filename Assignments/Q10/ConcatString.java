package com.yash.tdd.Assignments.Q10;

public class ConcatString {

	public static String conString() {
		String [] str= {"apple","orange","banana","lemon"};
		String res = String.join("-", str);
				
	System.out.println(res);
		return res;
	}
	public static void main(String[] args) {	
		conString();
	}
}
