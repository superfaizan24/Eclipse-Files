package hackerankprograms.camel_case;

public class Solution {
	 static int camelcase(String s) {
	        int i,j=0;
	        for(i=0;i<s.length();i++) {
	        if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				j++;
			}
	        }
	        return j+1;
	    }

}
