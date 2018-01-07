package com.java.Sample;
import java.util.Arrays;
import java.util.Scanner;

public class AngaramExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		boolean val = isAngaram(s1, s2);
        System.out.println((val)?"Anagrams":"Not Anagrams");
        scan.close();
	}

	public static boolean isAngaram(String A, String B) {
		// Complete the function
		Boolean retValue = false;
		if (A != null && B != null) {
			char[] arrayA = A.toLowerCase().toCharArray();
			char[] arrayB = B.toLowerCase().toCharArray();
			Arrays.sort(arrayA);
			Arrays.sort(arrayB);
			retValue = Arrays.equals(arrayA, arrayB);
		}
		return retValue;
	}
}
