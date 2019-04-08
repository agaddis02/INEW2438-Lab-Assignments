import java.util.ArrayList;
import java.util.InputMismatchException;
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
		try {
			System.out.println("Enter a course number:");
			tmpCourseName = input.next();		
			//create course object
			activeCourse = new Course(tmpCourseName);
		} catch (InputMismatchException ex) {
			System.out.println("====================================");
			System.out.println("Error occurred:" + ex.getMessage());
			System.out.println("====================================");			
		} catch (Exception ex) {
			System.out.println("====================================");
			System.out.println("Error occurred:" + ex.getMessage());
			System.out.println("====================================");
		}
		finally {			
			/* Return back to menu */
			displayMainMenu();
		}

	}

	/* Method - Add student to course */
	static void addStudentCourse() {
		/* Declare temporary variables */
		int tmpStudentNum;
		String tmpFirstName;
		String tmpLastname;

		try {
			/* Display option */
			tmpStudentNum = (int) ((Math.random() * 100) + 10);
			System.out.println("Enter the student information");
			/* Set student first name */
			System.out.println("First Name:");
			tmpFirstName = input.next();
			/* Set student last name */
			System.out.println("Last Name:");
			tmpLastname = input.next();

			/* Create student object */
			Student tmpStudent = new Student(tmpStudentNum,tmpFirstName,tmpLastname);
			/* Set student id */

			/* Set student address */
			System.out.println("Address 1:");
			tmpStudent.address1 = input.nextLine();
			System.out.println("Address 2:");
			tmpStudent.address2 = input.nextLine();
			System.out.println("Address 3:");
			tmpStudent.address3 = input.nextLine();
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

			activeCourse.addStudent(tmpStudent);
		}
		catch (Exception ex) {
			System.out.println("Error occured " + ex.getMessage());
		}
		finally {
			/* Return back to menu */
			displayMainMenu();
		}

	}	

	/* Method - Drop student from course */
	static void dropStudentCourse() {
		/* Display option */
		int tmpStudentNumber;
		try {
			System.out.println("Enter the student number");
			tmpStudentNumber = input.nextInt();
			activeCourse.dropStudent(tmpStudentNumber);
		}
		catch(NullPointerException e){
			System.out.println("Error has occurred " + e);
		}
		finally{
			/* Return back to menu */
			displayMainMenu();
		}

	}

	/* Method - Display all students enrolled in course */
	static void displayEnrollment() {

		try {
			System.out.println("Number of students enrolled are: " + activeCourse.getNumberOfStudents());
			System.out.println("===============================");
			ArrayList<Student> students = activeCourse.getStudents();
			/* Display names of student */
			for (int i=0; i < students.size(); i++) {
				students.get(i);
				System.out.println("Student Id:" + Student.GetStudentNumber()  + " -" + Student.GetStudentName());
			}
			System.out.println("===============================");
			System.out.println("Press any key to continue");
			input.next();
		}
		catch(NullPointerException e){
			System.out.println("Error has occurred " + e);
		}
		finally {
			/* Return back to menu */
			displayMainMenu();
		}


	}

}
