import java.util.ArrayList;
import java.util.Scanner;
/* Main starting class */
public class CourseApp {

	/* Global variables */
	static int userTopSelection = 0;
	static Scanner input = new Scanner(System.in);
	static Course activeCourse;

	/* Method - program entry point */
	public static void main(String[] args) {
		/* Display header */
		displayMainHeader();	
		/* Display menu option */
		displayMainMenu();		
	}

	/* Method - Display main header */
	static void displayMainHeader() {
		System.out.println("Welcome to my Course Registration");
		System.out.println("==================================");		
	}
	
	/* Method - Display main menu option */
	static void displayMainMenu() {
		/* Display menu */
		System.out.println("Select option:");
		System.out.println("1. Add a new course number");
		System.out.println("2. Add student to course");
		System.out.println("3. Drop student from course");
		System.out.println("4. Display course enrollment");
		System.out.println("5. Exit");
		/* Get user selection */
		userTopSelection = input.nextInt();
		
		switch(userTopSelection) {
		case 1:
			addNewCourse();
			break;
		case 2:
			addStudentCourse();
			break;
		case 3:
			dropStudentCourse();
			break;
		case 4:
			displayEnrollment();
			break;
		case 5:
			break;
		default:
				displayMainMenu();
				break;			
		}
	}
	
	/* Method - Add new course */
	static void addNewCourse() {
		/* Display option */
		String tmpCourseName = "";
		System.out.println("Enter a course number:");
		tmpCourseName = input.next();		
		//create course object
		activeCourse = new Course(tmpCourseName);
		/* Return back to menu */
		displayMainMenu();
	}
	
	/* Method - Add student to course */
	static void addStudentCourse() {
		/* Display option */
		Student tmpStudent = new Student();
		/* Set student id */
		tmpStudent.studentNumber = (int) (Math.random() + 10);
		System.out.println("Enter the student information");
		/* Set student first name */
		System.out.println("First Name:");
		tmpStudent.firstName = input.next();
		/* Set student last name */
		System.out.println("Last Name:");
		tmpStudent.lastName = input.next();
		/* Set student address */
		System.out.println("Address 1:");
		tmpStudent.address1 = input.next();
		System.out.println("Address 2:");
		tmpStudent.address2 = input.next();
		System.out.println("Address 3:");
		tmpStudent.address3 = input.next();
		/* Set student city */
		System.out.println("City:");
		tmpStudent.city = input.next();
		/* Set student state */
		System.out.println("State:");
		tmpStudent.state = input.next();
		/* Set student state */
		System.out.println("Zip Code:");
		tmpStudent.zipCode = input.next();
		/* Set student state */
		System.out.println("Country:");
		tmpStudent.country = input.next();
		try {
			activeCourse.addStudent(tmpStudent);
		}
		catch(NullPointerException e) {
			System.out.println("Caught the NullPointerException");
		}
		

		/* Return back to menu */
		displayMainMenu();
	}	
	
	/* Method - Drop student from course */
	static void dropStudentCourse() {
		/* Display option */
		int tmpStudentNumber;
		System.out.println("Enter the student number");
		try {
			tmpStudentNumber = input.nextInt();
			activeCourse.dropStudent(tmpStudentNumber);
		}
		catch(NullPointerException e) {
			System.out.println("Caught the NullPointerException");
		}
		/* Return back to menu */
		displayMainMenu();
	}
	
	/* Method - Display all students enrolled in course */
	static void displayEnrollment() {
		try {
			System.out.println("Number of students enrolled are: " + activeCourse.getNumberOfStudents());
			System.out.println("===============================");
			ArrayList<Student> students = activeCourse.getStudents();
			/* Display names of student */
			for (int i=0; i < students.size(); i++) {
				System.out.println("Student Id:" + students.get(i).studentNumber  + " -" + students.get(i).firstName + " " + students.get(i).lastName);
			}
			System.out.println("===============================");
			System.out.println("Press any key to continue");
			input.next();
		}
		catch(NullPointerException e) {
			System.out.println("Caught the NullPointerException");
		}
		/* Return back to menu */
		displayMainMenu();
	}
	
}
