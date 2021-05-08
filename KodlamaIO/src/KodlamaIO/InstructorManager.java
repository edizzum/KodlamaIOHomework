package KodlamaIO;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + ": isimli eðitmen" + user.getCourse()
				+ ": isimli kursu eklemiþtir ve eðitim verecektir.");
	}
	
	public void showInstructors(User[] users) {
		int i=1;
		for(User instructor:users) {
			System.out.println(i+"- Eðitmen adý: " + instructor.getFirstName() + "/ Soy adý: " + instructor.getLastName());
			i++;
		}
	}

	public void showInfo(Instructor instructor) {
		System.out.println("Ad: " + instructor.getFirstName());
		System.out.println("Soy ad: " + instructor.getLastName());
		System.out.println("ID Numarasý: " + instructor.getId());
		System.out.println("Eðitmen Numarasý: " + instructor.getInstructorNumber());
		System.out.println("E-mail: " + instructor.getEmail());
		System.out.println("Kurs: " + instructor.getCourse());
	}
}
