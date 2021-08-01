package hackerankprograms.find_digits;

public class Solution {
	static int findDigits(int n) {
		int rem,count=0,num=n;
		while(num!=0) {
			rem = num %10;
			if(rem!=0&&n%rem==0)
				count++;
			num/=10;
		}
		

		return count;
    }
}
