import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner toth = new Scanner(System.in);
		
		String ssn;
		
		
		System.out.println("What is your first name?");
		String firstName = toth.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = toth.nextLine();
		
		System.out.println("What is your street address?");
		String address = toth.nextLine();
		
		System.out.println("What city do you live in?");
		String city = toth.nextLine();
		
		System.out.println("What state do you live in?");
		String state = toth.nextLine();
		
		System.out.println("What is your zip code?");
		int zip = toth.nextInt();
		
		System.out.println("What is your scoial security number?");
		ssn = toth.next();
		
		String formattedSSN = ssn.substring(0,3) + "-" + ssn.substring(3,5) + "-" + ssn.substring(5, 9);

		
		
		
		System.out.println(firstName + " " + lastName);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zip);
		if(ssn.length() != 9) {
			System.out.println("Invalid");
		} else {
			System.out.println("SSN: " + formattedSSN);
		}

		
		
		
	}
}
