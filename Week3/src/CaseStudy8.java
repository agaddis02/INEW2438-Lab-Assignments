import java.util.Scanner;

public class CaseStudy8 {

	public static void main(String[] args) {
		// Generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		// Prompt the user to enter a guess
		Scanner scammer = new Scanner(System.in);
		System.out.print("Enter your lottery pick of 2 digits: ");
		int guess = scammer.nextInt(); 

		// Get digits from lottery 
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;

		// Get digits from guess 
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);
		
		int target = 0;

		// Check the guess 
		if (guess == lottery) {
			target = 1;
		}

		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
			target = 2;
		}

		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
			target = 3;
		}
		else {
			target = 4;
		}
		
		switch(target) {
		case 1:
			System.out.println("Perfect match, you win $10,000.");
			break;
		case 2:
			System.out.println("Well... atleast you got all the right digits, you win $3,000.");
			break;
		case 3:
			System.out.println("ooooof, only 1 digit was right man,  you win $1,000.");
			break;
		case 4:
			System.out.println("oooooooooooooooof, No matches, sorry no money for you.");
			break;
		}
		
		
		// Close Scammer
		scammer.close();


	}

}
