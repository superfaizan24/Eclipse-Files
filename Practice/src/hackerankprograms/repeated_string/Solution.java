package hackerankprograms.repeated_string;

public class Solution {
	static long repeatedString(String s, long n) {
		int i;
		long count = 0;
		int length = s.length(); // Finding the length of the string
		long groups = n / length; // Finding the groups in the string
		int remaining = (int) (n % length); // Finding the remaining characters in the infinite string
		int remainingA = 0; // Finding the number of occurrences of a in the string
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') // Iterating through the string to find the number of times a occurs
				count++;
			if (i == remaining - 1)
				remainingA = (int) count;
			}
		return count * groups + remainingA;

	}
}
