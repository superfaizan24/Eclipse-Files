package hackerankprograms.alternating_characters;

public class Solution {
	static int alternatingCharacters(String s) {
		int i,count=0;
		for(i=0;i<s.length();i++) {
			if(i++==i) {
				count++;
			}
		}
		return count;
    }
}
