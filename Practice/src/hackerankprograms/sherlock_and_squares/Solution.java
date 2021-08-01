package hackerankprograms.sherlock_and_squares;

public class Solution {
	static int squares(int a, int b) {
		int i,count=0;
		for(i=a;i<=9;i++) {
			if(i%Math.sqrt(i)==0) {
				count++;
			}
		}
		return count;

    }

}
