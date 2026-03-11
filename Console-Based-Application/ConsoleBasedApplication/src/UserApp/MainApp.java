package UserApp;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService service = new UserService();
		
		while(true) {
			System.out.println("\n=======User App Menu=======");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Show All user");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Enter username");
				String username = sc.nextLine();
				
				System.out.println("Enter the password");
				String  password = sc.nextLine();
				
				System.out.println("Enter the Email");
				String email = sc.nextLine();
				
				String regMsg = service.registerUser(username, password, email);
				System.out.println(regMsg);
				break;
				
			case 2:
				System.out.println("Enter username");
				String uname = sc.nextLine();
				
				System.out.println("Enter the password");
				String  pass = sc.nextLine();
				
				String LoginMsg = service.loginUser(uname, pass);
				System.out.println(LoginMsg);
				break;
				
			case 3:
				service.showAll();
				break;
				
			case 4:
				System.out.println("Exiting the application .... Thank you");
				sc.close();
				System.exit(0);
				
				
			default :
				System.out.println("Invalid choice please try again");
			}
		}
	}
}