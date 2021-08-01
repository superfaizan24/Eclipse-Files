package hackerankprograms.a_very_big_sum;

public class Solution {
	static long aVeryBigSum(long[] ar) {
		int i;
		long sum = 0;
		for (i = 0; i < ar.length; i++)
			sum += ar[i]; // Sum=sum+ar[i]

		return sum;
	}

}
