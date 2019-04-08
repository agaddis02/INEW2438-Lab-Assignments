
public class Student extends Address {
	/* Declare variables */
	private static int studentNumber;
	private static String firstName;
	private static String lastName;
	
	/* Default Constructor */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/* Overload constructor with parameters */
	public Student(String _address1, String _address2, String _address3, String _city, String _state, String _zipCode,
			String country) {
		super(_address1, _address2, _address3, _city, _state, _zipCode, country);
		// TODO Auto-generated constructor stub
	}
	
	/* Overload constructor to create the student object with 3 signatures */
	public Student(int _studentNum, String _firstName, String _lastName) {
		studentNumber = _studentNum;
		firstName = _firstName;
		lastName = _lastName;
	}

	/* Method - Get student full name  */
	public static String GetStudentName() {
		return firstName + " " + lastName;
	}
	
	/* Method - Get student number */
	public static int GetStudentNumber() {
		return studentNumber;
	}
}
