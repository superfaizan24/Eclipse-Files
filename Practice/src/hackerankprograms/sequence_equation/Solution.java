package hackerankprograms.sequence_equation;

public class Solution {
	static int[] sequenceEquation(int[] p) {
		int i,j;
		int v;
		for(i=0;i<p.length;i++) {
			for(j=0;j<p.length-1-i;j++) {
				if(p[j]>p[j+1]) {
					v=p[j];
					p[j] = p[j+1];
					p[j+1]=v;
				}
			}
		}
		
		return p;
		
    }
	

}
