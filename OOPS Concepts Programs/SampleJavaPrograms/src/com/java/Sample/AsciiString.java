package com.java.Sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class AsciiString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

		for (int i = 0; i < len; ++i) {
			char charAt = str.charAt(i);

			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}

		System.out.println(numChars);
		
		TreeMap<Character, Integer> sortedList = new TreeMap<>(numChars);
		System.out.println(sortedList);
		
		Set<Entry<Character, Integer>> mappings = sortedList.entrySet();

		for (Entry<Character, Integer> mapping : mappings) {
			System.out.print(mapping.getKey() + "" + mapping.getValue());
		}

	}
}
