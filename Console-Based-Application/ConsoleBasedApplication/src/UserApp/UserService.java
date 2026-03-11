package UserApp;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	//List to store registered user
	private List<User>users = new ArrayList<>();
	
	//Registration method
	public String registerUser(String username, String password, String email){
		
		//check if username already exists
		for(User user : users) {
			if(user.getusername().equalsIgnoreCase(username)) {
				return "username already taken please try another";
			}
		}
		
		//Create or add new user
		users.add(new User(username,password,email));
		return "Registration successful";
	}
	
	//Login method
	public String loginUser(String username,String password) {
		for(User user : users) {
			if(user.getusername().equalsIgnoreCase(username)&& user.getpassword().equalsIgnoreCase(password)) {
				return "Login successful ! Welcome," + username;
			}
		}
		return "Invalid username or password";
	}
	//Display all users
	public void showAll() {
		if(users.isEmpty()) {
			System.out.println("No registered user yet");
		}
		else {
			System.out.println("\n-----Registered users-----");
			for(User user:users) {
				System.out.println("username :"+user.getusername()+" Email :"+user.getemail());
				
			}
		}
	}
	
}