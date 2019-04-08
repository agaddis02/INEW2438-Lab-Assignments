import java.util.Scanner;

public class CaseStudy1 {

	public static void main(String[] args) {
		
		Scanner scammer = new Scanner(System.in);
		// 3.3.1
		
		// Declare X and Y Variables
		System.out.println("Give me a value for x");
		double x = scammer.nextDouble();
		System.out.println("Give me a value for y");
		double y = scammer.nextDouble();
		
		// Create if clause for when y is greater then 0
		if(y > 0) {
			x = 1;
		}

		
		// Print out X's values to to show if it is valid for the program
		System.out.println("Because Y was greater then 0, x's new value is: " + x);
		
		// Separator 
		System.out.println("***************************************************************");
		
		
		// 3.3.2
		// Declare score, salary, increase, and new salary variables
		System.out.println("What was your score?");
		double score = scammer.nextDouble();
		System.out.println("What is your salary?");
		double salary = scammer.nextDouble();
		double increase = salary *.03;
		double newSalary = salary + increase;
		
		
		// Set salary to new salary if score is greater than or equal to 90
		if (score >= 90) {
			salary = newSalary;
		}

		
		// Print out new salary
		System.out.println("Due to your score, your new anual salary is $ " + salary);
		
		// Separator 
		System.out.println("***************************************************************");
		
		
		
		
		// 3.3.3
		// Irrelevant 
		double radius = 3;
		double area;
		double PI = Math.PI;
		if (radius >= 0) // They had forgotten to put parentheses around " radius >= 0"
				{
				  area = radius * radius * PI;
				  System.out.println("The area for the circle of " +
				    " radius " + radius + " is " + area);
				}
		// Separator 
		System.out.println("***************************************************************");
		
		System.out.println("They had forgotten to put parentheses around 'radius >= 0'");

	}

}
