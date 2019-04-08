import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		
		Scanner toth = new Scanner(System.in);
		
		
		// Prompt the user to enter three points 
		System.out.print("Enter the X follwed by the Y for three points: ");
		double x1 = toth.nextDouble();
		double y1 = toth.nextDouble();
		double x2 = toth.nextDouble();
		double y2 = toth.nextDouble();
		double x3 = toth.nextDouble();
		double y3 = toth.nextDouble();
		
		
		// Compute three sides 
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		
		// Compute three angles 
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		
		// Display results
		System.out.println("The three angles are: " + "A: " +  Math.round(A * 100) / 100.0 + " " + "B: " +  Math.round(B * 100) / 100.0 + " " + "C: " +  Math.round(C * 100) / 100.0);
		
		// Close toth
		toth.close(); 

	}

}
