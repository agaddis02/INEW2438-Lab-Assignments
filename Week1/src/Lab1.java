
public class Lab1 {

	public static void main(String[] args) {
		
		// Print out the first statement
		System.out.println("Welcome to my first Java application.");
		
		
		// Print out the second statement 
		System.out.println("School:" + " " + "Richland College");
		
		
		// Print out the third statement 
		System.out.println("Class:" + " " + "INEW 2438");
		
		// Print blank space for bottom space
		System.out.println(" ");
		
		
		// Create radius Variable
		double circleRadius = 20;
		
		
		// Create width variable
		double rectangleWidth = 50;
		
		
		//Create length variable
		double rectangleLength = 30;
		
		
		// Create area variable with calculation
		double rectangleArea = rectangleWidth* rectangleLength;
		
		
		// Create area variable with calculation
		double circleArea = Math.PI * (circleRadius * circleRadius);
		
		
		// Create area Variable that adds both the previous area's 
		double combinedArea = circleArea + rectangleArea;
		
		
		// Add the areas together 
		System.out.println("The area of a rectangle plus the area of the circle is: " + (int)combinedArea + " " + "ft");
		
		
	}

}
