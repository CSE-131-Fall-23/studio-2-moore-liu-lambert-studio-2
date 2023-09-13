package studio2;

import java.util.Scanner;

public class gamblerRuin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int winlimit=7;
		int startAmount=3;
		double winChance=.68;
		int stop=0;
		int losings=0;
		int winnings=0;
		int amount=startAmount+winnings-losings;
		boolean notWon= winlimit>amount;
		boolean notLoss=amount>stop;
				
		
		while (notWon&&notLoss) {
			double chanceWin= in.nextDouble();
			Math.random();
		if (chanceWin<winChance) {amount++}
		
		else {amount-1}
		System.out.print(amount);
		}
			
		}
			
			
		
	

	}

}
