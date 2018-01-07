package com.java.Sample;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberingToStringInput {

	public static void main(String[] args) {
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) { //check if any next values, also example of EOF
			i++;
			System.out.println(i + " " + sc.nextLine());
		}
	}
}