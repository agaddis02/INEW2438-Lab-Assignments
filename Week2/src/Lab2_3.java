import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// Create all constants for the equation
		final double a = 10;
		final double b = 20;
		final double c = 2;
		final double y;
		final double x;		
		
		// Create a Scanner
		       Scanner input = new Scanner(System.in);
		       

				System.out.println("Please enter a value for y: ");
				
				// Store the users value
				y = input.nextDouble();
				
				// Prompt the user to enter a value for x
				System.out.println("Please enter a value for x: ");
				
				// Store the users value 
				x = input.nextDouble();
				
				// Create equation
				double equation = ((3 + 4*x)/5) - ((10*(y - 5)*(a + b + c))/x) + 9 * ((4/x) + ((9 + x)/y)) ;
		   
		       // Receive the amount 
		       System.out.print(
		         "Enter an amount in double, for example 11.56: ");
		       double amount = input.nextDouble();
		 
		       int remainingAmount = (int)(amount * 100);
		   
		      // Find the number of one dollars
		      int numberOfOneDollars = remainingAmount / 100;
		      remainingAmount = remainingAmount % 100;
		 
		      // Find the number of quarters in the remaining amount
		       int numberOfQuarters = remainingAmount / 25;
		       remainingAmount = remainingAmount % 25;
		   
		       // Find the number of dimes in the remaining amount
		       int numberOfDimes = remainingAmount / 10;
		       remainingAmount = remainingAmount % 10;
		   
		      // Find the number of nickels in the remaining amount
		       int numberOfNickels = remainingAmount / 5;
		       remainingAmount = remainingAmount % 5;
		   
		       // Find the number of pennies in the remaining amount
		       int numberOfPennies = remainingAmount;
		   
		       // Display results
				
				// Print result
				System.out.println("The result of your is equation is: " + equation);
		       System.out.println("Your amount " + amount + " consists of"); 
		       System.out.println("    " + numberOfOneDollars + " dollars");
		       System.out.println("    " + numberOfQuarters + " quarters ");
		       System.out.println("    " + numberOfDimes + " dimes"); 
		       System.out.println("    " + numberOfNickels + " nickels");
		       System.out.println("    " + numberOfPennies + " pennies");
		       
		       input.close();
		       
		       
		    

				
				
				
				// Print result
				System.out.println(equation);
				


	}

}
