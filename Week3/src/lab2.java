import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		// Create instance of scanner named scammer
		Scanner scammer = new Scanner(System.in);
		
		// Create Constants 
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		// Prompt the user to enter a weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = scammer.nextDouble();

		// Prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		double height = scammer.nextDouble();

		// Convert weight to kilograms
		weight = weight * KILOGRAMS_PER_POUND;

		// Convert height to meters
		height = height * METERS_PER_INCH;

		// Compute BMI
		double BMI = weight / Math.pow(height, 2);

		// Display result
		System.out.println("BMI is: " + BMI);
		
		// If statements to print what category your BMI puts you in
		if (BMI < 18.5) {
			System.out.println("Your BMI suggest you are Under Weight");
		}
		
		else if (BMI >= 18.5 && BMI < 25.0) {
			System.out.println("You have a normal BMI");
		}
		
		else if (BMI >= 25.0 && BMI < 30.0) {
			System.out.println("Your BMI suggest you are Over Weight");
		}
		
		else if (BMI >= 30.0) {
			System.out.println("Your BMI suggest you are Obese");
		}
		
		
		// Close scammer
		scammer.close();

	}

}
