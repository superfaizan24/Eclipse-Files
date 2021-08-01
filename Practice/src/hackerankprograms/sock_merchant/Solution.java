package hackerankprograms.sock_merchant;

public class Solution {
	static int sockMerchant(int n, int[] ar) {
		int i, j, pairs = 0,temp=0; // Loop Variables
		// Sorting Logic
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i - 1; j++) {
				// Swapping Logic
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		// Temp is equal to the number of identical elements
		for(i=0;i<n-1;i++) {
			temp = 1;
			for(j=i+1;j<n;j++) {
				if(ar[i]==ar[j])
					temp++;
				else {
					i=j-1;
					break;
				}
			}
			// Pairs is number of identical elements divided by two
			pairs+=(temp/2); // updating the value of pairs
			if(j==n)
				break;
		}
		return pairs;
	}

}
