package com.yash.tdd.Assignments.Q12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() throws CloneNotSupportedException {
		Student s1 = new Student(1, "Mayur");
		Student s2 = (Student)s1.clone();
		
		assertEquals(true, Student.checkClone(s1, s2));
	}

}
