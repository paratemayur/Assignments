package com.yash.tdd.Assignments.Q9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveCaseTest {

	@Test
	void test() {
		assertEquals("This Red Car.", RemoveCase.removeCase("This @Red $Car-."));
	}

}
