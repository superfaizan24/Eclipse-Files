package hackerankprograms.breaking_the_records;

public class Solution {
	static int[] breakingRecords(int[] scores) {
		int result[] = {0,0};
		int lowestScore,highestScore,i;
		lowestScore= highestScore = scores[0];
		for(i=1;i<scores.length;i++) {
			if(scores[i]>highestScore) {
				result[0]++;
				highestScore=scores[i];
			}
			if(scores[i]<lowestScore) {
				result[1]++;
				lowestScore=scores[i];
			}
			
		}
		return result;
	}
}
