package hackerankprograms.counting_valleys;

public class Solution {
	static int countingValleys(int n, String s) {
		int i, position = 0, numberOfValleys = 0;
		int a[] = new int[n];
		// Making an integer array of positions from the given string
		for (i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				position++;
			} else if (s.charAt(i) == 'D') {
				position--;
			}
			a[i] = position;
		}
		int flag = 1; // Flag denotes whether we are in a hill or a valley, 1 for valley, 0 for hill
		// Initially assuming that we entered a valley
		if (a[0] == 1) // Changing the valley of flag if the first step is a hill
			flag = 0;
		// Traversing through each position, then finding 0, and checking whether the
		// journey from the previous 0 was a hill or a valley
		for (i = 1; i < n; i++) {
			if (a[i] == 0) { // Checking whether we arrived at a 0 or not
				if (flag == 1) // Checking whether the journey was a valley or not
					numberOfValleys++; // Incrementing number of valleys
				if (i != n - 1) { // Ensuring that it is not the last element of the array
					if (a[i + 1] == 1)
						flag = 0;
					else
						flag = 1;
				}
			}
			if(a[i]>0) // Checking for the current position if it turns out to be a hill (positive number)
				flag = 0; // Updating the value of flag to 0
			
		}
		return numberOfValleys;
	}
}
