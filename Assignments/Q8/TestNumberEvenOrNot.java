package com.yash.tdd.Assignments.Q8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNumberEvenOrNot {

	@Test
	void test() {
		assertEquals(4, NumberEvenOrNot.CountingEvenOdd(new int[] {2, 3, 4, 5, 6, 7, 8}));
	}

}
