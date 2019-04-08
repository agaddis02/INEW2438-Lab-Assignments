import java.util.Scanner;

public class Lab8_2 {

	
	public static void go() {
		Scanner toth = new Scanner(System.in);
		
		double[] numbers = new double[20];
		
		Sort sort = new Sort(toth);
		
		// Prompt user
		System.out.println("Enter 20 numbers: \n");
		
		sort.setNumbers(numbers, toth);
		sort.getNumbers();
		
		sort.setAmountOfValues(numbers);
		System.out.println("You have entered " + sort.getAmountOfValues() + " values");
		
		sort.setMaxValue(numbers);
		System.out.println("The max value of the numbers you submitted is: " + sort.getMaxValue());
		
		sort.setMinValue(numbers);
		System.out.println("The min value of the numbers you submitted is: " + sort.getMinValue());
		
		sort.setAverage(numbers);
		System.out.println("The average value of the numbers you submitted is: " + sort.getAverage());
		
		sort.setTotalNumber(numbers);
		System.out.println("All of the numbers you submitted add up to: " + sort.getTotalNumber());
		

		
		
		
	}
	public static void main(String[] args) {
		go();
	}

}
