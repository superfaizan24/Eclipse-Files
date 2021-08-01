package hackerankprograms.time_in_words;

public class Solution {
	 static String timeInWords(int h, int m) {
		 String answer = "",hour="",suffix="",minute="",word="minutes";
		 if(m==1) {
			 word = "minute";
		 }
		 if(m>30) {
			 h++;
		 }
		 // Hours
		 if(h==1) 
			 hour="one";
		 else if(h==2)
			 hour="two";
		 else if(h==3)
			 hour="three";
		 else if(h==4)
			 hour="four";
		 else if(h==5)
			 hour="five";
		 else if(h==6)
			 hour="six";
		 else if(h==7)
			 hour="seven";
		 else if(h==8)
			 hour="eight";
		 else if(h==9)
			 hour="nine";
		 else if(h==10)
			 hour="ten";
		 else if(h==11)
			 hour="eleven";
		 else if(h==12)
			 hour="twelve";
		 // Exceptions
		 if(m==00) {
			answer = hour + " o' clock";
		 }
		 if(m==15) {
			 answer = "quarter past "+ hour;
		 }
		 if(m==30) {
			 answer = "half past "+ hour;
		 }
		 if(m==45) {
			 answer = "quarter to "+ hour;
		 }
		 // Suffixes
		 if(m<=30) {
			 suffix = "past";
		 }
		 if(m>=31) {
			 suffix = "to";
		 }
		 // Minutes - Before 30
		 if(m==1) {
			 minute = "one";
		 }else if(m==2) {
			 minute = "two";
		 }else if(m==3) {
			 minute = "three";
		 }else if(m==4) {
			 minute = "four";
		 }else if(m==5) {
			 minute = "five";
		 }else if(m==6) {
			 minute = "six";
		 }else if(m==7) {
			 minute = "seven";
		 }else if(m==8) {
			 minute = "eight";
		 }else if(m==9) {
			 minute = "nine";
		 }else if(m==10) {
			 minute = "ten";
		 }else if(m==11) {
			 minute = "eleven";
		 }else if(m==12) {
			 minute = "twelve";
		 }else if(m==13) {
			 minute = "thirteen";
		 }else if(m==14) {
			 minute = "fourteen";
		 }else if(m==16) {
			 minute = "sixteen";
		 }else if(m==17) {
			 minute = "seventeen";
		 }else if(m==18) {
			 minute = "eighteen";
		 }else if(m==19) {
			 minute = "nineteen";
		 }else if(m==20) {
			 minute = "twenty";
		 }else if(m==21) {
			 minute = "twenty one";
		 }else if(m==22) {
			 minute = "twenty two";
		 }else if(m==23) {
			 minute = "twenty three";
		 }else if(m==24) {
			 minute = "twenty four";
		 }else if(m==25) {
			 minute = "twenty five";
		 }else if(m==26) {
			 minute = "twenty six";
		 }else if(m==27) {
			 minute = "twenty seven";
		 }else if(m==28) {
			 minute = "twenty eight";
		 }else if(m==29) {
			 minute = "twenty nine";
		 }
		 // Minutes - After 30
		 if(m==59) {
			 minute = "one";
		 }else if(m==58) {
			 minute = "two";
		 }else if(m==57) {
			 minute = "three";
		 }else if(m==56) {
			 minute = "four";
		 }else if(m==55) {
			 minute = "five";
		 }else if(m==54) {
			 minute = "six";
		 }else if(m==53) {
			 minute = "seven";
		 }else if(m==52) {
			 minute = "eight";
		 }else if(m==51) {
			 minute = "nine";
		 }else if(m==50) {
			 minute = "ten";
		 }else if(m==49) {
			 minute = "eleven";
		 }else if(m==48) {
			 minute = "twelve";
		 }else if(m==47) {
			 minute = "thirteen";
		 }else if(m==46) {
			 minute = "fourteen";
		 }else if(m==44) {
			 minute = "sixteen";
		 }else if(m==43) {
			 minute = "seventeen";
		 }else if(m==42) {
			 minute = "eighteen";
		 }else if(m==41) {
			 minute = "nineteen";
		 }else if(m==40) {
			 minute = "twenty";
		 }else if(m==39) {
			 minute = "twenty one";
		 }else if(m==38) {
			 minute = "twenty two";
		 }else if(m==37) {
			 minute = "twenty three";
		 }else if(m==36) {
			 minute = "twenty four";
		 }else if(m==35) {
			 minute = "twenty five";
		 }else if(m==34) {
			 minute = "twenty six";
		 }else if(m==33) {
			 minute = "twenty seven";
		 }else if(m==32) {
			 minute = "twenty eight";
		 }else if(m==31) {
			 minute = "twenty nine";
		 }
		 if(m!=00&&m!=15&&m!=30&&m!=45) {
			answer = minute+" "+word+" "+suffix+" "+hour;
		 }
		 return answer;
}
}
