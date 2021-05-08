package KodlamaIO;

public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + ": isimli e�itmen" + user.getCourse()
				+ ": isimli kursu eklemi�tir ve e�itim verecektir.");
	}
	
	public void showInstructors(User[] users) {
		int i=1;
		for(User instructor:users) {
			System.out.println(i+"- E�itmen ad�: " + instructor.getFirstName() + "/ Soy ad�: " + instructor.getLastName());
			i++;
		}
	}

	public void showInfo(Instructor instructor) {
		System.out.println("Ad: " + instructor.getFirstName());
		System.out.println("Soy ad: " + instructor.getLastName());
		System.out.println("ID Numaras�: " + instructor.getId());
		System.out.println("E�itmen Numaras�: " + instructor.getInstructorNumber());
		System.out.println("E-mail: " + instructor.getEmail());
		System.out.println("Kurs: " + instructor.getCourse());
	}
}
