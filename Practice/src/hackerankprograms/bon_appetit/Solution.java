package hackerankprograms.bon_appetit;

import java.util.List;

public class Solution {
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int a = bill.get(k),sum=0;
		int i;
		for(i=0;i<bill.size();i++) {
			sum+=bill.get(i);
		}
		int actual = (sum-a)/2;
		int charged = b - actual;
		if(b==actual) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(charged);
		}
		 
    }
}
