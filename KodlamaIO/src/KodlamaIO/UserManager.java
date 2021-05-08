package KodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + ": kullanýcýsý eklendi!");
	}	
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}