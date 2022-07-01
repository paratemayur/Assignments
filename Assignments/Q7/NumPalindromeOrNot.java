package com.yash.tdd.Assignments.Q7;

public class NumPalindromeOrNot {

	public static boolean checkPalindrome(int num) {

		int reversedNum = 0, remainder;
		int originalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
			return true;
		} else {
			System.out.println(originalNum + " is not Palindrome.");
			return false;
		}
	}
	
	public static void main(String[] args) {
		NumPalindromeOrNot.checkPalindrome(3553);
	}
}
