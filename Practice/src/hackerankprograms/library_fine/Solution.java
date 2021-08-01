package hackerankprograms.library_fine;

public class Solution {
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int fine;
		if (y1 == y2) {
			if (m1 == m2) {
				if (d1 <= d2) {
					fine = 0;
				} else {
					fine = 15 * (d1 - d2);
				}
			} else if (m1 < m2) {
				fine = 0; // since the return month is less than the due month
			} else {
				fine = 500 * (m1 - m2);
			}
		} else if (y1 < y2) {
			fine = 0; // since the return year is less than the due year
		} else {
			fine = 10000; // return year is greater than the due year, so fixed fine is charged
		}

		return fine;

	}
}
