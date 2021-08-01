package hackerankprograms.hackerrank_in_a_string;

public class Solution {
	static String hackerrankInString(String s) {
		String search = "hackerrank"; // Storing the string to be searched in a variable
		int i, j = 0, length = search.length(), count = 0; // i is the loop variable for iterating over the input
		// j is the variable used to iterate over the string to be searched
		// count is used to store the the number of valid comparisons
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == search.charAt(j)) { // Checking whether the character in the search string is present in
													// in the input string or not
				j++; // Updating the iterating variable of the search string in order to look for the
						// next character
				count++; // Incrementing count
			}
			if (count == length) // Checking whether the entire string is found or not
				return "YES";
		}
		return "NO";

	}
}
