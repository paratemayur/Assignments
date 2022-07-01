package com.yash.tdd.Assignments.Q15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	  @AfterEach
	    void tearDown() throws Exception {


	    }
	    @Test
	    void test() {
	        Item i = new Item (1,"Parle-G", 45,55,LocalDate.of(2022,06,22),LocalDate.of(2022, 07, 05));

	        assertEquals(true,i.createObject(i));
	    }

}
