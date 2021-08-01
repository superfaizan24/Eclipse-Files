package hackerankprograms.electronics_shop;

public class Solution {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int i, j, max=-1;
		for(i=0;i<keyboards.length;i++) {
			for(j=0;j<drives.length;j++) {
				if(((keyboards[i]+drives[j])<=b)&&((keyboards[i]+drives[j])>max))
					max = keyboards[i] + drives[j];
			}
		}

		return max;

	}
}
