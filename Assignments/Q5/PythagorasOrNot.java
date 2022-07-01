package com.yash.tdd.Assignments.Q5;

public class PythagorasOrNot {
	public static boolean Pythagoras(int a, int b, int c) {
		 if(a*a==b*b+c*c)
	      {
			 System.out.println("pair from pythgoras theorem satisfying : "+a+" "+b+" "+c);
				
	          return true;
	      }
	      else
	    	  System.out.println("pair from pythgoras theorem not satisfying : "+a+" "+b+" "+c);
			
	      return false;

	}
	public static void main(String[] args) {
		PythagorasOrNot.Pythagoras(5,3,4);
	}
}
