package hackerankprograms.simple_array_sum;

public class Solution {
	static int simpleArraySum(int[] ar) {
		int i,sum=0;
 		for(i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
	       return sum;

    }
}
