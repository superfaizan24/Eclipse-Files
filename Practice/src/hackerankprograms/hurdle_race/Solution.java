package hackerankprograms.hurdle_race;

public class Solution {
	static int hurdleRace(int k, int[] height) {
		int i,j,largestNumber=height[0],answer;
		for(i=1;i<height.length;i++) 
			if(height[i]>largestNumber)
				largestNumber = height[i];
		if(largestNumber>k) {
			answer = largestNumber-k;
		}
		else {
			answer = 0;
		}
		
		return answer;

	}
}
