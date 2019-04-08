
public class Student extends Address {
	/* Declare variables */
	int studentNumber;
	String firstName;
	String lastName;
	
	/* Default Constructor */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/* Constructor with parameters */
	public Student(String _address1, String _address2, String _address3, String _city, String _state, String _zipCode,
			String country) {
		super(_address1, _address2, _address3, _city, _state, _zipCode, country);
		// TODO Auto-generated constructor stub
	}

}
