package com.yash.tdd.Assignments.Q3;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() throws ClassNotFoundException, SQLException {
		assertTrue(User.checkDataMatchOrNot("", ""));
	}

}
