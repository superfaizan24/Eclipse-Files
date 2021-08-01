package hackerankprograms.staircase;

public class Solution {
	static void staircase(int n) { // Static functions can be called without creating objects of the respective class(can be called by the class name)
		int i, j; // Loop variables
		
		for (i = 1; i <= n; i++) { // Outer loop
			for (j = 1; j <= n - i; j++) { // Loop for printing the spaces
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) { // Loop for printing the hash characters
				System.out.print("#");
			}
			System.out.println(); // To break the line
		}
	}

}
