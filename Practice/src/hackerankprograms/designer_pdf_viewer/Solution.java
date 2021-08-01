package hackerankprograms.designer_pdf_viewer;

public class Solution {
	static int designerPdfViewer(int[] h, String word) {
		int i,max=h[(int)word.charAt(0)-97];
		for(i=1;i<word.length();i++) 
			if(max<h[(int)word.charAt(i)-97]) 
				max=h[(int)word.charAt(i)-97];
			
		return max*word.length();

    }
}
