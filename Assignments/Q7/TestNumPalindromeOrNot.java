package com.yash.tdd.Assignments.Q7;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.yash.tdd.Assignments.Q4.ArmstrongOrNot;

public class TestNumPalindromeOrNot
{
	@Test
	public void Test() {
		 assertEquals(true, NumPalindromeOrNot.checkPalindrome(1221));
	}
}
