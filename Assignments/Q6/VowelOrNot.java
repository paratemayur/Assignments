package com.yash.tdd.Assignments.Q6;

public class VowelOrNot {

	public static int countVowel(String str) {

		str = str.toLowerCase();
		int count = 0;
		
for (int i = 0; i < str.length(); i++) {
		  if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	          count++; 
			  System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
		
		  }
		 
		  
		}            
			System.out.println("Total no of vowels in string are: " + count);
				return count;
	}

	public static void main(String[] args) {
		VowelOrNot.countVowel("Mayur Parate");
	}
}
