import java.util.ArrayList;

/* Class - Course  */
public class Course {
	/* Declare members */
	private String courseName;
	private static ArrayList<Student> students = new ArrayList<Student>();

/* Method - constructor */
	Course(String _courseName) {
		courseName = _courseName;
	}
	
/* Method - Get course name */
String getCourseName() {
		return courseName;
	}

/* Method - Add student to course */
void addStudent(Student student) {
	students.add(student);
}

/* Method - Get all students enrolled in class */
ArrayList<Student> getStudents() {
	return students;
}

/* Method - Returns the total number of students enrolled */
int getNumberOfStudents() {
	return students.size();
}

/* Method - Drop student from course */
void dropStudent(int studentNumber) {
	for (int i=0; i < students.size(); i++) {
		students.get(i);
		if (Student.GetStudentNumber() == studentNumber) {
			students.remove(i);
		}
	}
}
}









