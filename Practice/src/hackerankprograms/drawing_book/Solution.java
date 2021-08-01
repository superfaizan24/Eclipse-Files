package hackerankprograms.drawing_book;

public class Solution {
	static int pageCount(int n, int p) {
		if (p <= n / 2) {
			return p / 2;
		} else {
			if ((n % 2 == 0) && (p % 2 != 0))
				return (n - p) / 2 + 1;
			return (n - p) / 2;
		}

	}
}
