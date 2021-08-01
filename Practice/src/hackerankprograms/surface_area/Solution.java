package hackerankprograms.surface_area;

public class Solution {
	static int surfaceArea(int[][] a) {
		int rows=a.length;
		int columns=a[0].length;
		int front;
		int back;
		int left;
		int right;
		int top=rows*columns;
		int bottom=top;
		return front+back+left+right+top+bottom;
	
    }

}
