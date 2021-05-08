package KodlamaIO;

public class StudentManager extends UserManager{
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "isimli ��renci" + user.getCourse() + "Kursuna kayd� yapm��t�r.");
	}
	
	
	public void showStudents(User[] users) {
		int i = 1;
		for(User student: users) {
			System.out.println(i+"- ��renci ad�: " + student.getFirstName() + "/ Soy ad�: " + student.getLastName());
		}
	}
	
	
	public void showInfo(Student student) {
		System.out.println("Ad: " + student.getFirstName());
		System.out.println("Soy ad: " + student.getLastName());
		System.out.println("ID Numaras�: " + student.getId());
		System.out.println("��renci Numaras�: " + student.getStudentNumber());
		System.out.println("E-Mail: " + student.getEmail());
		System.out.println("Kursu: " + student.getCourse());
		System.out.println("Puan�: " + student.getGrade());
	}
	
	
	

}
