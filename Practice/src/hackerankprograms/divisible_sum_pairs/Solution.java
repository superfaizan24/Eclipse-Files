package hackerankprograms.divisible_sum_pairs;

public class Solution {
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int i, j, pairs = 0;
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0)
					pairs++;

			}
		}
		return pairs;
	}
}
