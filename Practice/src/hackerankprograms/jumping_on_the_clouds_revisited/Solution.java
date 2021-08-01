package hackerankprograms.jumping_on_the_clouds_revisited;

public class Solution {
	static int jumpingOnClouds(int[] c, int k) {
		int e = 100;
		int i, n = c.length;
		i = 0;
		do {
			i = (i + k) % n;
			if (c[i] == 0)
				e--;
			else
				e -= 3;

		} while (i != 0);

		return e;

	}
}
