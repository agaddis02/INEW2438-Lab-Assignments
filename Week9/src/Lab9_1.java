import java.util.Objects;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
public class Lab9_1 {
	public static void displayCourse1(Course course) {
		System.out.println();
		String[] students = course.getStudents();
		System.out.println("The students in "+ course.getCourseName()+" are: ");
		for (int i = 0; i < course.getNumberOfStudents(); i++) {
			students = ArrayUtils.nullToEmpty(students);
			System.out.print(students[i] + " ");
		}

		System.out.println();
	}

	public static String getUserCourseName(Scanner toth) {
		System.out.println();
		System.out.print("Enter course name: ");
		System.out.println();
		String userCourseName = toth.nextLine();
		return userCourseName;	
	}

	public static String getStudentName(Scanner toth) {
		System.out.print("Enter student name: ");
		String stuName = toth.next();
		return stuName;	
	}

	public static void displayHeader() {
		System.out.println("==================================");
		System.out.println("   Welcome to Course Management   ");
		System.out.println("==================================");
	}

	public static void displayFooter() {
		System.out.println();
		System.out.println("====================================");
		System.out.println("   Course Management Session Over   ");
		System.out.println("====================================");
	}

	public static void getStudents (Course course, int students, Scanner toth) {
		course.addStudent(""+ getStudentName(toth));
		System.out.println();
	}

	public static void drop(Scanner toth, Course course) {
		System.out.println("Would you like to drop a student?(Y/N)");
		String answer = toth.next();
		if(answer.equals("y")|| answer.equals("Y")) {
			System.out.println("Enter the name of the student you want to drop: ");
			String dropStudent = toth.next();
			course.dropStudent(dropStudent);
		}
		else {
			System.out.println("You decided not to drop a student");
		}
	}
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner toth = new Scanner(System.in);

		String option;
		do {
			displayHeader();

			//Create  Course with user given names 
			Course course = new Course(""+ getUserCourseName(toth)); 

			//Add students to first course & Prompt for number of students and student names
			System.out.println();
			System.out.print("How many students are in "+ course.getCourseName()+" ? ");
			int students = toth.nextInt();
			System.out.println();

			//for loop to get the right amount of students
			for (int i = 0; i < students; i++) {
				getStudents(course, students, toth);
			}

			//Prompt to drop a student
			drop(toth, course);

			//Display students in  course
			displayCourse1(course);

			displayFooter();
			System.out.println("Would you like to make a new course (Y/N)?");
			option = toth.next();
		}while(option.equals("Y") || option.equals("y"));
	}
}

