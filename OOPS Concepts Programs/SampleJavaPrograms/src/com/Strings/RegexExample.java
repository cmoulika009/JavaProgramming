package com.Strings;
import java.util.Scanner;
import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern.compile(pattern); // Compiled representation of Regular
											// Expression
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				// TODO: handle exception
				System.out.println("InValid");
			}
			testCases--;
		}
	}
}
