package com.yash.tdd.Assignments.Q1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHCF {

	@Test
	void test() {
		assertEquals(90, HCf.findHCF(900, 270));
	}
}
