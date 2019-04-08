import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// Name the scanner 
		Scanner scanner = new Scanner(System.in);
		
		
		// Prompt the user to enter rectangles length
		System.out.println("Enter the length of Rectangle:");
		
		
		// Store length in variable
		double length = scanner.nextDouble();
		
		
		// Prompt user to enter rectangles width
		System.out.println("Enter the width of Rectangle:");
		
		
		// Store width in variable
		double width = scanner.nextDouble();
		
		
		// Create variable to calculate rectangle area
		double rectangleArea = length * width;
		
		
		// Print area of the users rectangle
		System.out.println("Area of Rectangle is: " + rectangleArea);
		
		
		
		// Prompt user to enter circle radius
		System.out.println("Enter the radius of Circle");
		
		
		// store radius in variable
		double radius = scanner.nextDouble();
		
		
		// Create variable to calculate area of circle
		double circleArea = Math.PI * (radius * radius);
		
		
		// Print out area of circle
		System.out.println("Area of Circle is: " + circleArea);
		
		
		// Calculate combined Areas
		double combinedAreas = rectangleArea + circleArea;
		
		
		// Print out combined areas
		System.out.println("The area of the Rectangle and Circle combined is: " + combinedAreas);

	}

}
