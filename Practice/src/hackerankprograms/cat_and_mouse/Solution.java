package hackerankprograms.cat_and_mouse;

public class Solution {
	static String catAndMouse(int x, int y, int z) {
		String answer="";
		int num1 = z - x, num2 = z - y;
		if (num1 < 0) {
			num1 = -num1;
		}  if (num2 < 0) {
			num2 = -num2;
		}
		if (num1 == num2) {
			answer = "Mouse C";
		}
		
		else if (num1 < num2) {
			answer = "Cat A";
		} else  {
			answer = "Cat B";
		}
		return answer;

	}
}