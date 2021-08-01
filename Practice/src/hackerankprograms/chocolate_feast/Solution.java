package hackerankprograms.chocolate_feast;

public class Solution {
	static int chocolateFeast(int n, int c, int m) {
		int numberOfChocolates=n/c;
		int numberOfWrappers=numberOfChocolates;
		while(numberOfWrappers>=m) {
			 numberOfChocolates+=(numberOfWrappers/m);
			 numberOfWrappers=(numberOfWrappers/m)+(numberOfWrappers%m);
		}
		
		return numberOfChocolates;
    }
}
