package hackerankprograms.picking_numbers;

import java.util.Collections;
import java.util.List;

public class Solution {
	public static int pickingNumbers(List<Integer> a) {
		int i, count, j, max = 1;
		Collections.sort(a);
		for (i = 0; i < a.size() - 1; i++) {
			count = 1;
			for (j = i + 1; j < a.size(); j++) {
				if (a.get(j) - a.get(i) <= 1)
					count++;
				else
					break;
				if (count > max)
					max = count;

			}
		}
		return max;

	}
}
