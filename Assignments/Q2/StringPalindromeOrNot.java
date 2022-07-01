package com.yash.tdd.Assignments.Q2;

public class StringPalindromeOrNot {

	public static boolean checkPalindrome(String str1, String str2) {

		int i = 0;
		char s[] = str1.toCharArray();
		int j = s.length - 1;
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		String str = new String(s);
		if (str.equalsIgnoreCase(str1) && str.equalsIgnoreCase(str2)) {
			System.out.println(str1 + "is palindrome");
			return true;
		} else {
			System.out.println(str1 + " is not palindrome");
			return false;
		}
	}
	public static void main(String[] args) {
		StringPalindromeOrNot.checkPalindrome("mom", "mom");
	}
}
