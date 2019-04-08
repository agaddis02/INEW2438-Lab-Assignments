
public class Lab5_1 {

	public static void main(String[] args) {
		
		// Number of primes to display
		final int TOTAL_NUMBER = 50;
		// Display 10 per line
		final int NUMBER_PER_LINE = 10; 
		
		// Continuous count
		int count = 0;
		// Prime tester
		int number = 2; 
		
		System.out.println("The first 50 prime numbers are \n");
		
		// Find all prime numbers up to 50
		while (count < TOTAL_NUMBER) {
			
			// Assume number prime
			boolean primeNumber = true;

			// Prime test for loop
			for (int i = 2; i <= number / 2; i++) {
				
				// if there is no remainder, false
				if (number % i == 0) {
					
					// 
					primeNumber = false; 
					
					break;
				}
			}

			// Display the prime number and increase the count
			if (primeNumber) {
				
				// Increase the count
				count++; 
				
				
				// Once count 10 numbers have been written out. go to next line
				if (count % NUMBER_PER_LINE == 0) {
					// Show number and go to next line
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}

			// Check if the next number is prime
			number++;
		}
	}
}
