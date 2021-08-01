package hackerankprograms.bigger_is_greater;

public class Solution {
	static String biggerIsGreater(String w) {
		int i,store=w.charAt(0),store1=w.length()+1,count=0;
		String answer = "";
		for(i=0;i<w.length();i++) {
			if(i==store) {
				count++;
			}
			if(count==store1) {
				answer="no answer";
			}
		}
		System.out.println(w.length());
		return answer;

    }

}
