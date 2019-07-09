package Chapter11.Exercise.Ex2;

import Chapter11.Exercise.Ex2.Constant;
import Chapter11.Exercise.Ex2.Constant.ClassStatus;

public class Student extends Person {
	private final Status status;
	
	public Student(Status status) {
		this.status = status;
	}
	
	public Student() {
		this.status = new Status();
		this.status.setClassStatus(Constant.ClassStatus.FRESH_MAN);
	}
	
}

class Status {
	private ClassStatus classStatus;
	
	public Status() {
		
	}
	
	public Status(ClassStatus classStatus) {
		this.setClassStatus(classStatus);
	}

	/**
	 * @return the classStatus
	 */
	public ClassStatus getClassStatus() {
		return classStatus;
	}

	/**
	 * @param classStatus the classStatus to set
	 */
	public void setClassStatus(ClassStatus classStatus) {
		this.classStatus = classStatus;
	}
	
	
	
}
