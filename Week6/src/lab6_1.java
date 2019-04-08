import java.util.Arrays;
import java.util.Scanner;
public class lab6_1 {
	public static void main(String[] args) {
		// Create scanner
		Scanner toth = new Scanner(System.in);
		// Create array
		double[] numbers = new double[20];

		run(toth, numbers);

	}
	public static void header(String title) {
		// Print out given title inside of the argument
		System.out.println(title);
	}
	public static void initialize(Scanner toth, double[] numbers){

		// Prompt user
		System.out.println("Enter 20 numbers: \n");


		// Input user values
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = toth.nextDouble();
		}
		// print array
		System.out.println("You entered the following numbers:");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	public static void totalValues(double[] numbers) {
		// Print out the length of the array
		System.out.println("The total amount of values you entered was: \n" + numbers.length);
	}
	public static double getMinValue(double[] numbers){
		// Sort the array
		Arrays.sort(numbers);
		// Print out the lowest value of the given array 
		System.out.println("The smallest value you entered was: \n" + numbers[0]);
		return numbers[0];
	}
	public static double getMaxValue(double[] numbers){
		// Sort the array
		Arrays.sort(numbers);
		// Print out the highest value of the given array
		System.out.println("The largest value you entered was: \n" + numbers[numbers.length-1]);
		return numbers[numbers.length-1];
	}
	public static double getAverage(double[] numbers){
		// create variable that stores the average of the array
		double average = Arrays.stream(numbers).average().getAsDouble();
		// Print out the average of the array
		System.out.println("The average of the values you entered is: \n" + average);
		return average;
	}
	public static void run(Scanner toth, double[] numbers) {
		// initialize a variable for answer
		String answer;
		// Create a continuance loop
		do {
			header("Welcome to a single dimensional array demo \n" + "******************************************");
			initialize(toth, numbers);
			totalValues(numbers);
			getMinValue(numbers);
			getMaxValue(numbers);
			getAverage(numbers);
			// Ask user if they would like to enter more numbers
			System.out.println("Would you like to continue? \n" + "Y/N");
			// Store users answer in the variable answer
			answer = toth.next();
		}
		while(answer.equals("y") || answer.equals("Y"));
	}

}
