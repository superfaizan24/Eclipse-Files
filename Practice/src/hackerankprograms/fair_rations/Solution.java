package hackerankprograms.fair_rations;

public class Solution {
	static int fairRations(int[] B) {
		int i, count;
		count = 0;
		if (B.length == 2) { // if there are only 2 numbers in the array
			if (B[0] % 2 == 0 && B[1] % 2 == 0)
				return 0;
			else if (B[0] % 2 != 0 && B[1] % 2 != 0)
				return 2;
			else
				return -1;
		}
		if (B[0] % 2 != 0) { // If the first number is not even
			B[0]++;
			B[1]++;
			count++;
		}
		if (B[B.length - 1] % 2 != 0) { // The number before the last number
			B[B.length - 1]++;
			B[B.length - 2]++;
			count++;
		}
		for (i = 1; i < B.length - 1; i++) { // Iterating through the array
			if (B[i] % 2 != 0) {
				B[i]++;
				B[i + 1]++;
				count++;
			}
		}
		if (B[B.length - 1] % 2 != 0)
			return -1;

		return count * 2;
	}

}
