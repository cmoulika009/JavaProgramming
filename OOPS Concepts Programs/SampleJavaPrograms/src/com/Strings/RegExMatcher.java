package com.Strings;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExMatcher {

	public static void main(String[] args) {

		String text = "This is the text to be searched " + "for occurrences of the http:// pattern.";

		String patternString = ".*http://.*";
		System.out.println("Regex:" + patternString);
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		boolean matches = matcher.matches();//checks if regex matches in input
		System.out.println("Matches=" + matches);

		patternString = "This is the text";
		System.out.println("Regex:" + patternString);
		pattern = Pattern.compile(patternString);
		matcher = pattern.matcher(text);
		System.out.println("Matches=" + matcher.matches());
		System.out.println("lookingAt = " + matcher.lookingAt()); //matches first string content
	}
}