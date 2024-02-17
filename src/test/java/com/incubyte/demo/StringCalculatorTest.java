package com.incubyte.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
    public void testTwoNumbers() {
        assertEquals(6, StringCalculator.add("1,5"));
    }

}
