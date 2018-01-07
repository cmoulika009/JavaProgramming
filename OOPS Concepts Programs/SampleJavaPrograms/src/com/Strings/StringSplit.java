package com.Strings;
import java.io.*;
import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		if (scan.hasNext() == false)
			System.out.println(0); // 1
		else {
			String s = scan.nextLine();
			String del = "[\\s+_@!,?.']+";
			String[] str = s.trim().split(del); // 3

			if (str.length > 0 && str.length < 4 * Math.pow(10, 5)) { // 2
				System.out.println(str.length);
				for (String s1 : str)
					System.out.println(s1);

			} else
				System.out.println(0);

		}
		scan.close();
	}
}
