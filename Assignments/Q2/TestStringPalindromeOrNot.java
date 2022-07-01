package com.yash.tdd.Assignments.Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStringPalindromeOrNot {

	@Test
	public void test() {
		//assertTrue(StringPalindromeOrNot.checkPalindrome("radar", "radar"));
		assertEquals(true, StringPalindromeOrNot.checkPalindrome("radar", "radar"));
	}

}
