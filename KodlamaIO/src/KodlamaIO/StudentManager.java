package KodlamaIO;

public class StudentManager extends UserManager{
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "isimli öğrenci" + user.getCourse() + "Kursuna kaydı yapmıştır.");
	}
	
	
	public void showStudents(User[] users) {
		int i = 1;
		for(User student: users) {
			System.out.println(i+"- Öğrenci adı: " + student.getFirstName() + "/ Soy adı: " + student.getLastName());
		}
	}
	
	
	public void showInfo(Student student) {
		System.out.println("Ad: " + student.getFirstName());
		System.out.println("Soy ad: " + student.getLastName());
		System.out.println("ID Numarası: " + student.getId());
		System.out.println("Öğrenci Numarası: " + student.getStudentNumber());
		System.out.println("E-Mail: " + student.getEmail());
		System.out.println("Kursu: " + student.getCourse());
		System.out.println("Puanı: " + student.getGrade());
	}
	
	
	

}
