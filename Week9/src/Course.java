import org.apache.commons.lang3.ArrayUtils;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	//Create Constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}

	//Add student to class
	public void addStudent(String student) { 
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() { 
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public  void dropStudent(String dropStudent) { 
		students = (String[])ArrayUtils.removeElement(students, dropStudent);
	}
}