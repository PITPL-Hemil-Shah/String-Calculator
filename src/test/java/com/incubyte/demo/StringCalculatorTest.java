package com.incubyte.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testSingleNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(6, StringCalculator.add("1,5"));
	}

	@Test
	public void testNewLinesBetweenNumbers() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test
	public void testCustomDelimiter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}

	@Test
	public void testNegativeNumbers() {
		try {
			StringCalculator.add("-1,2,-3");
			fail("Expected exception for negative numbers not thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("negative numbers not allowed: -1, -3", e.getMessage());
		}
	}
}