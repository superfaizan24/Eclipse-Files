package hackerankprograms.utopian_tree;

public class Solution {
	static int utopianTree(int n) {
		int answer = 1;
		String store="";
		int i;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				store="Spring";
			}
			else if(i%2==0) {
				store="Summer";
			}
			if(store=="Spring") {
				answer=answer*2;
			}
			else if(store=="Summer") {
				answer++;
			}
		}
		return answer;

	}
}
