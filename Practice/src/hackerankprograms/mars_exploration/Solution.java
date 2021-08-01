package hackerankprograms.mars_exploration;

public class Solution {
	static int marsExploration(String s) {
		int counter = 0;
		int i;
		for (i = 0; i < s.length(); i++)
			if ((i % 3 == 1 && s.charAt(i) != 'O') || (i % 3 == 0 || i % 3 == 2) && s.charAt(i) != 'S')
				counter++;

		return counter;
	}
}
