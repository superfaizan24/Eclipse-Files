package hackerankprograms.birthday_cake_candles;

public class Solution {
	static int birthdayCakeCandles(int[] arr) {
		int i; // Loop Variable
		int max = arr[0]; // initializing the maximum value with the first element of the array
		int c = 1; // c is the counter for the maximum element
		for (i = 1; i < arr.length; i++) { 
			if (arr[i] > max) { // Checking for a new maximum value
				max = arr[i]; // Updating the maximum value
				c = 1; // Resetting the counter value to one for the new maximum
			} else if (arr[i] == max) { // Checking for recurrence of the maximum value
				c++; // Updating the counter variable
			}
		}

		return c;
	}
}
