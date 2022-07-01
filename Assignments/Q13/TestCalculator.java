package com.yash.tdd.Assignments.Q13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void add() {
		assertEquals(20, Calculator.add(15, 5));
	}
	@Test
	void sub() {
		assertEquals(10, Calculator.sub(15, 5));
	}
	@Test
	void mul() { 
		assertEquals(75, Calculator.mul(15, 5));
	}
	@Test
	void div() {
		assertEquals(3, Calculator.div(15, 5));
	}
	@Test
	void mod() {
		assertEquals(15, Calculator.mod(115, 20));
	}
	@Test
	void power() {
		assertEquals(49,Calculator.power(7, 2));
	}
	@Test
	void sqrt() {
		assertEquals(4, Calculator.sqrt(16));
	}
}
