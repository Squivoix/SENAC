package if_else;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		String username, password;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Username: ");
		
		username = scanner.nextLine();
		
		System.out.print("Password: ");
		
		password = scanner.nextLine();
		
		if(username.equals("admin") && password.equals("123")) {
			System.out.println("Login successfull!");
		} else {
			System.out.println("Login unsuccessfull!");			
		}
		
		scanner.close();
	}

}
