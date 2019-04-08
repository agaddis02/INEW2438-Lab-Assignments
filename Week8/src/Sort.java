import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

public class Sort {

	Scanner toth = new Scanner(System.in);
	
	private double[] numbers = new double[20];
	
	private double minValue;
	private double maxValue;
	private double average;
	private double totalNumber;
	private double amountOfValues;
	public Sort(Scanner toth) {
		super();
		this.toth = toth;
	}

	
	
	public double[] getNumbers() {
		return numbers;
	}
	
	
	public void setNumbers(double[] numbers, Scanner toth) {
		// Input user values
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = toth.nextDouble();
		}
		// print array
		System.out.println("You entered the following numbers:");
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		this.numbers = numbers;
	}
	
	// MIN
	public double getMinValue() {
		return minValue;
	}
	public void setMinValue(double[] numbers) {
		// Sort
		Arrays.sort(numbers);
		// Get min 
		double minValue = numbers[0];
		this.minValue = minValue;
	}
	
	// MAX
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double[] numbers) {
		// Sort
		Arrays.sort(numbers);
		// Get max
		double maxValue = numbers[numbers.length-1];
		this.maxValue = maxValue;
	}
	
	// AVG
	public double getAverage() {
		return average;
	}
	public void setAverage(double[] numbers) {
		
		// get the average
		double average = Arrays.stream(numbers).average().getAsDouble();
		
		this.average = average;
	}
	
	// TOTAL  NUMBER
	public double getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(double[] numbers) {
		// Get the summation
		double totalNumber = DoubleStream.of(numbers).sum();
		
		this.totalNumber = totalNumber;
	}
	
	// AMOUNT OF VALUES
	public double getAmountOfValues() {
		return amountOfValues;
	}
	public void setAmountOfValues(double[] numbers) {
		// Get total amount of inputted values 
		double amountOfValues = numbers.length;
		
		this.amountOfValues = amountOfValues;
	}

}
