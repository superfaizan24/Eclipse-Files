package simpleprograms;

import java.util.Scanner;

public class AdderFromOneToThirty {

	public static void main(String[] args) {
		int n=500000000;
	int i, sum = 0;

	for (i = 1; i <= n; i++) {
		sum = sum + i;

	}
		
	System.out.println(sum);
	}
}