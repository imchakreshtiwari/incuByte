package com.example.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void check_With_Number_Divided_BYFour_and_Hundred() {
		LeapYearCheck leapYear = new LeapYearCheck();
		assertTrue(leapYear.isLeapYear(2000));
	}

	@Test
	void check_With_Number_Divided_BY_FourHundred_and_Hundred() {
		LeapYearCheck leapYear = new LeapYearCheck();
		assertTrue(leapYear.isLeapYear(1600));
	}

	@Test
	void check_With_Number_Divided_BY_Hundredand_NotDivideBy_FourHundred() {
		LeapYearCheck leapYear = new LeapYearCheck();
		assertEquals(leapYear.isLeapYear(1500), false);
	}

	@Test
	void check_With_NotDivideBy_Four() {
		LeapYearCheck leapYear = new LeapYearCheck();
		assertEquals(leapYear.isLeapYear(2007), false);
	}
	
	//check for Zero
	@Test
	void check_With_wrongInput() {
		LeapYearCheck leapYear = new LeapYearCheck();
		assertEquals(leapYear.isLeapYear(0), false);
	}

}
