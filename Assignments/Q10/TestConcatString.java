package com.yash.tdd.Assignments.Q10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConcatString {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon", ConcatString.conString());
	}

}
