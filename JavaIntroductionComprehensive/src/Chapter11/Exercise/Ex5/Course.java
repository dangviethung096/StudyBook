package Chapter11.Exercise.Ex5;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students;
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
		numberOfStudents = 0;
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		for(int i = 0 ; i < students.size(); i++) {
			// check each student
			if(students.get(i).equals(student)) {
				students.remove(i);
				numberOfStudents--;
			}
		}
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @return the students
	 */
	public ArrayList<String> getStudents() {
		return students;
	}
	
	/**
	 * @return the numberOfStudents
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	
}
