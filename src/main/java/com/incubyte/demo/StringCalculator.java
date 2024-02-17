package com.incubyte.demo;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	public static int add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		}
		String delimiter = ",|\n";
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("\n");
			delimiter = numbers.substring(2, delimiterIndex);
			numbers = numbers.substring(delimiterIndex + 1);
		}
		String[] nums = numbers.split(delimiter);
		int sum = 0;
		List<Integer> negativeNumbers = new ArrayList<>();
		for (String num : nums) {
			int n = Integer.parseInt(num);
			if (n < 0) {
				negativeNumbers.add(n);
			} else {
				sum += n;
			}
		}
		if (!negativeNumbers.isEmpty()) {
			throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
		}
		return sum;
	}
}
