package hackerankprograms.kangaroo;

public class Solution {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		double n = (double) (x2 - x1) / (v1 - v2); // Formula for n
		if (((n - (int) n) == 0) && (n > 0)) // Checking whether n is a positive integer or not
			return "YES"; 
		return "NO";

	}
}
