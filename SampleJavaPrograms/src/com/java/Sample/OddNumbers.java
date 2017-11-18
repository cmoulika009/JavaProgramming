package com.java.Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class OddNumbers {

	private static int[] lists;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		List<Integer> oddFinal = OddNumbers.oddNumbers(first, last);
		System.out.println(oddFinal);
		int[] arrayOdd = OddNumbers.oddNumbersArray(first, last);
		for (int i = 0; i < arrayOdd.length; i++) {
			System.out.println(arrayOdd[i]);
		}
		sc.close();
	}

	static List<Integer> oddNumbers(int l, int r) {
		lists = null;
		int j = 0;
		List<Integer> ts = new ArrayList<Integer>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0)
				ts.add(i);
		}
		return ts;

	}

	static int[] oddNumbersArray(int l, int r) {
		lists = null;
		int j = 0;
		List<Integer> ts = new ArrayList<Integer>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0)
				ts.add(i);
		}
		
		int sizeList=ts.size();
		int[] oddList = new int[sizeList];
		Iterator<Integer> iterator = ts.iterator();
	    for (int i = 0; i < oddList.length; i++)
	    {
	    	oddList[i] = iterator.next().intValue();
	    }

		return oddList;

	}

}
