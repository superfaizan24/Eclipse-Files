
package hackerankprograms.angry_professor;

public class Solution {
	static String angryProfessor(int k, int[] a) {
		String response = "";
		int i,counter=0;
		for(i=0;i<a.length;i++) {
			if(a[i]>=0) {
				counter++;
			}
		}
		if(counter>=k) {
			response = "NO";
		}
		else {
			response = "YES";
		}
		return response;

    }
}
