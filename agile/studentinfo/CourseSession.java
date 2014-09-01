package studentinfo;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents = 0;
	
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public void enroll(Student student) {
		numberOfStudents ++;
	}
	

}
