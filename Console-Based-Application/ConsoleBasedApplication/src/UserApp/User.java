package UserApp;

public class User {
	private String username;
	private String password;
	private String email;
	
	//constructor
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	//getter
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	public String getemail() {
		return email;
	}
	
	
}