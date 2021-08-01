package hackerankprograms.day_of_the_programmer;

public class Solution {
	static String dayOfProgrammer(int year) {
		String leap = "";
		String result = "";
		if (year % 4 == 0 && year % 100 != 0) {
			leap = "yes";
		} else if (year % 400==0) {
			leap = "yes";
		} else {
			leap = "no";
		}
		if (leap.equals("yes")) {
			result = "12.09." + year;
		} else if (leap.equals("no")) {
			result = "13.09." + year;
		}
		return result;
	}
}
