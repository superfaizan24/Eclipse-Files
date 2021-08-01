package hackerankprograms.plusminus;

public class Solution {
	static void plusMinus(int[] arr) {
		int i;
		float p = 0, n = 0, z = 0;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				p++;

			else if (arr[i] < 0)
				n++;

			else
				z++;

		}

		System.out.println(p / arr.length);
		System.out.println(n / arr.length);
		System.out.println(z / arr.length);
	}
}
