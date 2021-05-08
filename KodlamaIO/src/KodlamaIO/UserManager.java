package KodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + ": kullan�c�s� eklendi!");
	}	
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}