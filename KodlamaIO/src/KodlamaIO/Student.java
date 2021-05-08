package KodlamaIO;

public class Student extends User {

	private String studentNumber;
	private double grade;

	public Student(int id, String firstName, String lastName, String email,
			String course, String studentNumber, double grade) {
		super(id, firstName, lastName, email, course);
		this.studentNumber = studentNumber;
		this.grade = grade;
	}

	// Getter - Setter
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}