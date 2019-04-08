import java.util.Scanner;

public class CaseStudy2 {

	public static void main(String[] args) {
		// Declare Variables
		Scanner scammer = new Scanner(System.in);
		System.out.println("What was your score?");
		double score = scammer.nextDouble();
		System.out.println("What is your salary?");
		double salary = scammer.nextDouble();
		double increase = salary *.03;
		double lessenedIncrease = salary * .01;
		double newSalary = salary + increase;
		double newLessenedSalary = salary + lessenedIncrease;
		
		// Set salary to new salary if score is greater than or equal to 90
		if (score >= 90) {
			salary = newSalary;
		}
		//  Set salary to lessened salary otherwise
		else {
			salary = newLessenedSalary;
		}
		// Print out the new salary
		System.out.println(salary);
		
		// Print out new salary
		System.out.println("Due to your score, your new anual salary is $ " + salary);

	}

}
