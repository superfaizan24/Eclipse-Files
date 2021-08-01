package hackerankprograms.migratory_birds;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static int migratoryBirds(List<Integer> a) {
		int i, count = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, answer = 0;
		for (i = 0; i < a.size(); i++) {
			if (a.get(i) == 1) {
				count++;
			}
			if (a.get(i) == 2) {
				count2++;
			}
			if (a.get(i) == 3) {
				count3++;
			}
			if (a.get(i) == 4) {
				count4++;
			}
			if (a.get(i) == 5) {
				count5++;
			}
		}
		if (count >= count2 && count >= count3 && count >= count4 && count >= count5) {
			answer = 1;
		} else if (count2 >= count && count2 >= count3 && count2 >= count4 && count2 >= count5) {
			answer = 2;
		} else if (count3 >= count && count3 >= count2 && count3 >= count4 && count3 >= count5) {
			answer = 3;
		} else if (count4 >= count && count4 >= count2 && count4 >= count3 && count3 >= count5) {
			answer = 4;
		} else if (count5 >= count && count5 >= count2 && count5 >= count3 && count5 >= count4) {
			answer = 5;
		}
		return answer;

	}
}