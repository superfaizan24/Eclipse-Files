package hackerankprograms.viral_advertising;

public class Solution {
	static int viralAdvertising(int n) {
		int likes =0,shared =5,cumulative=0,i;
		for(i=1;i<=n;i++) {
			likes = shared / 2;
			shared = likes*3;
			cumulative +=likes;
		}
		return cumulative;

    }

}
