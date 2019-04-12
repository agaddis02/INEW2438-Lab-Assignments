import java.util.Scanner;
public class DemoApp {
	
	static ICircle circle = new Circle();
	static Scanner toth = new Scanner(System.in);
	static IRectangle rectangle = new Rectangle();
	static double radius;
	static double length;
	static double width;
	static int selection;
	
	
	public static void run() {
		header();
		mainMenu();
		footer();
	}
	
	
	public static void mainMenu(){
		/* Display menu */
		System.out.println("Select option:");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		/* Get user selection */
		selection = toth.nextInt();
		
		switch(selection) {
		case 1:
			runCircle();
			break;
		case 2:
			runRectangle();
			break;
		}
	}
	
	public static void lengthWidth() {
		System.out.println("Whats the length of your rectangle? ");
		length = toth.nextDouble();
		System.out.println("Whats the width of your rectangle? ");
		width = toth.nextDouble();
	}
	
	public static void runRectangle() {
		lengthWidth();
		displayRectangleArea();
		mainMenu();
	}
	
	public static void runCircle() {
		getRadius();
		displayCircleArea();
		mainMenu();
	}
	
	public static void displayRectangleArea(){
		System.out.println("Area = " + rectangle.getArea(length, width) );
	}
	public static void getRadius() {
		System.out.println("Please enter the radius of your circle: ");
		radius = toth.nextDouble();
	}
	
	public static void displayCircleArea() {
		System.out.println("Area = " + circle.getArea(radius) + "\n");
	}
	
	public static void header() {
		System.out.println("******************************************");
		System.out.println("Welcome to abstract class demo application");
		System.out.println("******************************************");
	}
	public static void footer() {
		System.out.println("*****************************");
		System.out.println("Program Finished Successfully");
		System.out.println("*****************************");
	}
	
	// Entry Point
	public static void main(String[] args) {
		// Declarations of variables
		run();

	}

}
