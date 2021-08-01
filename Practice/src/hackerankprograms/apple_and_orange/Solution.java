package hackerankprograms.apple_and_orange;

public class Solution {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount = 0, orangeCount = 0, i;
		for (i = 0; i < apples.length; i++) {
			if (a + apples[i] >= s && a + apples[i] <= t) {
				appleCount++;
			}
		}
		for (i = 0; i < oranges.length; i++) {
			if (b + oranges[i] >= s && b + oranges[i] <= t) {
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
		
	}
}
