package KodlamaIO;

public class Instructor extends User {
	private String instructorNumber;
	
	//Constructor
	public Instructor(int id, String firstName, String lastName, String email,
			String course, String instructorNumber) {
		super(id, firstName, lastName, email, course);
		this.instructorNumber = instructorNumber;
	}
	
	
	//Getter - Setter
	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
}
