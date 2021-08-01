package hackerankprograms.time_conversion;

public class Solution {
	static String timeConversion(String a) {
		String s = ""; // Initializing the return variable with an empty String
		if (a.charAt(8) == 'P') { // Identifying whether the input is AM or PM
			if (a.substring(0, 2).equals("12")) { // If the input is twelve PM it is noon
				s += a.substring(0, 8);
			} else {
				String hours = a.substring(0, 2); // Taking the hour digits of the input
				int h = Integer.parseInt(hours); // Converting the input in hours from String to Integer
				h += 12; // adding twelve to the hour digits of the input
				s += h; // Appending the updated hours value in the return variable
				s += a.substring(2, 8); // Appending the remaining String to the return variable
			}
		} else {
			if (a.substring(0, 2).equals("12")) { // Identifying if the input is AM
				s += "00"; // Converting the 12 to 00
				s += a.substring(2, 8); // Appending the updated hours value in the return variable
			} else {
				s = a.substring(0, 8); // Printing the input without the AM
			}

		}
		return s; // Returning the variable
	}
}
