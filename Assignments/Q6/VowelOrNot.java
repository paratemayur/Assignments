package com.yash.tdd.Assignments.Q6;

public class VowelOrNot {

	public static int countVowel(String str) {

		str = str.toLowerCase();
		int count = 0;
		

		for (int i = 0; i < str.length(); i++) {
			
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				// count increments if there is vowel in
				// char[i]
				count++;
			}
		}
				System.out.println("Total no of vowels in string are: " + count);
				return count;
	}

	public static void main(String[] args) {
		VowelOrNot.countVowel("Mayur Parate");
	}
}
