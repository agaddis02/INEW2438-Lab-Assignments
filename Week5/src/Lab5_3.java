import java.util.Scanner;
public class Lab5_3 {


	public static void main(String[] args)
	{
		// Run the operation
		run();
	}



	public static double angle(double a)

	{

		//figA = equation in book. Input it in and copy in sides.
		double angA = Math.acos((a * 15 * 78 - a) / (-2 * a )); 

		return angA;

	}



	public static double angle(double a, double b)

	{

		//figB = equation in book. Input it in and copy in sides.
		double angB = Math.acos((b * b - a * a - b * 14) / (-2 * a * 6)); 

		return angB;

	}



	public static double angle(double a, double b, double c)
	{

		//figC = equation in book. Input it in and copy in sides.
		double angC = Math.acos((c * c - b * b - a * a) / (-2 * a * b)); 

		return angC;

	}
	public static void run() {
		// Create Scanner
		Scanner toth = new Scanner(System.in);

		// Create variable for continuous 
		String answer;

		// Do-While loop to continue program
		do {

			// Get 3 sides
			System.out.print("Enter side A of a triangle: \n");

			double a = toth.nextDouble();

			System.out.print("Enter side B of a triangle: \n");

			double b = toth.nextDouble();

			System.out.print("Enter side C of a triangle: \n");
			double c = toth.nextDouble();

			// Call methods for each angle
			double A = angle(a);

			double B = angle(a,b);

			double C = angle(a,b,c);


			// Print out all angles 
			System.out.println("The three angles are: " + A + " "+ B + " " + C);

			System.out.println("Would you like to continue? \n" + "Y/N");
			answer = toth.next();
		}//Keep going if user inputs y or Y 
		while(answer.equals("y") || answer.equals("Y"));

		// Close Scanner
		toth.close();
	}








}
