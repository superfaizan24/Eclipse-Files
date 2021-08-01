package hackerankprograms.birthday_chocolate;

import java.util.List;

public class Solution {
	static int birthday(List<Integer> s, int d, int m) {
		int i, j, ways = 0, sum;
		for (i = 0; i <= s.size() - m; i++) {
			sum = 0;
			for (j = i; j < i + m; j++)
				sum += s.get(j);
			if (sum == d)
				ways++;

		}
		return ways;

	}
}
