package com.Strings;
import java.util.Date;
import java.util.Scanner;

public class StingFormat {
	/*
	 * Each String is left-justified with trailing whitespace through the first
	 * 15 characters. The leading digit of the integer is the 16th character, and each
	 * integer that was less than 3 digits now has leading zeroes.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
		System.out.println("================================");
	}
}
