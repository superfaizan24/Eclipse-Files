package hackerankprograms.halloween_sale;

public class Solution {
	static int howManyGames(int p, int d, int m, int s) {
		int countOfGames = 0;
		int costOfGame = p;
		if(s<p) {
			return 0;
		}
		if(s<m) {
			return 0;
		}
		while(s>=m) { // If the value of s is = to m or greater than you will go into the loop
			if(s>=costOfGame) { // If is greater than p
				countOfGames++; // increasing the counter variable
				s-=costOfGame; // s - p
				costOfGame-=d; // p - d
				if(costOfGame<m)  // making costOfGame = m
				costOfGame=m;
			}
		}
		return countOfGames;
      

    }
}
