import java.util.Scanner;

public class Authentication {
	
	public static void main(String[] args) {
		String Username = "kevin", Password = "007";
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = input1.next();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = input2.next();
		
		if (username.equals(Username) && password.equals(Password)) {

	        System.out.println("Welcome " + username);
	    }

	    else if (username.equals(Username)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(Password)) {
	        System.out.println("Invalid Username!");
	    } else {
	        System.out.println("Invalid Username or Password!");
	    }

	}

	}
	