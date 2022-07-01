package com.yash.tdd.Assignments.Q6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVowelOrNot {

	@Test
	void test() {
		assertEquals(11, VowelOrNot.countVowel("Mayur Parate"));
	}

}
