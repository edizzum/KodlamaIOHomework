package KodlamaIO;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(12345, "Ediz", "ZÜM", "ediz.zum@kodlama.io", "JAVA & React kamp", "78945", 95.3);
		Student student2 = new Student(45632, "Doða", "BOLCAN", "doga.bolcan@kodlama.io", "JAVA & React", "65678", 98.25);
		
		
		Instructor instructor1 = new Instructor(00456, "Engin", "DEMIROG", "engin.demirog@kodlama.io", "JAVA & React kamp", "00987");
		Instructor instructor2 = new Instructor(00637, "Sadi Evren", "SEKER", "sadi.evren@kodlama.io", "C++", "00645");
		
		UserManager userManager = new UserManager();
		//userManager.add(student1);
		//userManager.add(instructor1);
		
		
		User[] users = {student1,student2,instructor1,instructor2};
		//userManager.addMultiple(users);
		
		
		Student[] students = {student1,student2};
		StudentManager studentManager = new StudentManager();
		//studentManager.showInfo(student1);
		studentManager.showStudents(students);
		System.out.println("----------------");
		studentManager.showInfo(student1);
		
		System.out.println("----------------");
		
		Instructor[] instructors = {instructor1,instructor2};
		InstructorManager instructorManager = new InstructorManager();
		//instructorManager.showInfo(instructor2);
		instructorManager.showInstructors(instructors);
		instructorManager.showInfo(instructor1);
		System.out.println("----------------");
		userManager.add(student1);
		System.out.println("----------------");
		userManager.addMultiple(users);
		
	}

}
