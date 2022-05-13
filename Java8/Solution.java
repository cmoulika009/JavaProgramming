import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public int myAtoi(String s) {
		String s1 = s.trim();
		int x = 0;
		int sign = 0;
		if (s.length() == 0)
			return 0;
		String[] splited = s1.split("\\s+|[\\.]");
		String first = splited[0];
		if (first.matches("^[a-zA-Z]*$") && !first.matches("-?\\d+(\\.\\d+)?")) {
			return 0;
		} else {
			System.out.println(first);
			if (first.contains("+") && first.contains("-")) {
				return 0;
			} else if (splited[0].charAt(0) == '+' || splited[0].charAt(0) == '-') {
				sign = (splited[0].charAt(0) == '-') ? -1 : 1;
				first = splited[0].substring(1,splited[0].length());
			}
			if (first.matches("-?\\d+(\\.\\d+)?")) {
				try {
					x = (sign== -1) ? Integer.parseInt(splited[0]) : Integer.parseInt(first);
				} catch (NumberFormatException e) {
					if (sign == -1) {
						return Integer.MIN_VALUE;
					} else {
						return Integer.MAX_VALUE;
					}
				}
			}
		}
		return x;
	}

	public static void main(String args[]) {
		Solution s = new Solution();
		int rev = s.myAtoi("-8900");
		System.out.println(rev);

	}
}