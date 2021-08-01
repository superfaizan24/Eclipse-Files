package hackerankprograms.beautiful_days_at_the_movies;

public class Solution {
	static int beautifulDays(int i, int j, int k) {
		int beautifulDays = 0;
		for (int index = i; index <= j; index++)
			if ((index - numberReverse(index)) % k == 0)
				beautifulDays++;

		return beautifulDays;
	}

	static int numberReverse(int number) {
		int reversedNumber = 0;
		while (number != 0) {
			reversedNumber = 10 * reversedNumber + number % 10;
			number /= 10;
		}
		return reversedNumber;
	}

}
