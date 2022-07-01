package com.yash.tdd.Assignments.Q11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SigletoneTest {

	@Test
	void test() {
		Singleton st1 = Singleton.getSingleton();
		Singleton st2 = Singleton.getSingleton();
		
		assertTrue(SingletonCheck.chechSingleton(st1, st2));
	}

}
