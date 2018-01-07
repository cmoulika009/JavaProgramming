package com.java.Sample;
import java.util.*;
import java.time.LocalDate;

public class DateCalc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mm = in.next();
		String dd = in.next();
		String yy = in.next();
		System.out.println(getDay(dd,mm,yy));
		in.close();
	}

	public static String getDay(String day, String month, String year) {
		/*
		 * Write your code here.
		 */
		int dd = Integer.parseInt(day);
		int mm = Integer.parseInt(month);
		int yy = Integer.parseInt(year);
		
		LocalDate dt = LocalDate.of(yy, mm, dd);
		
		String dayFinal = String.valueOf(dt.getDayOfWeek());
		return dayFinal;
	}

}
