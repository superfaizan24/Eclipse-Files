package hackerankprograms.funny_string;

public class Solution {
	public static String funnyString(String s) {
	    int i;
	    int left, right;
	    int n = s.length();
	    for(i=0;i<n-1;i++) {
	    	left=Math.abs(s.charAt(i)-s.charAt(i+1));
	    	right=Math.abs(s.charAt(n-i-1)-s.charAt(n-i-2));;
	    	if(left!=right)
	    		return "Not Funny";
	    }
		return "Funny";
	    }
}
