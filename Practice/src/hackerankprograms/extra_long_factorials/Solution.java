package hackerankprograms.extra_long_factorials;

import java.math.BigInteger;

public class Solution {
	static void extraLongFactorials(int n) {
		int i;
		BigInteger count= new BigInteger("1");
		for(i=n;i>=1;i--) {
			count = count.multiply(BigInteger.valueOf(i));
		}
		System.out.println(count);
    }
}
