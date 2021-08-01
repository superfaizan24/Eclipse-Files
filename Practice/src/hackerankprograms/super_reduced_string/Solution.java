package hackerankprograms.super_reduced_string;

public class Solution {
	 static String superReducedString(String s) {
		 int i;
		 String str="";
		 s+=" ";
		 for(i=0;i<s.length()-1;i++) {
			 if(s.charAt(i)==s.charAt(i+1)) 
				 i++;
			 else 
				str+=s.charAt(i);
			 
		 }
		 if(str.length()==0) 
		 return "Empty String";
		 return str;

	    }

}
