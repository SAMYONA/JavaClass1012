
import java.util.Scanner;

public class Login {
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	
		
		
		
		
		
				Scanner scanner = new Scanner(System.in);

				String storingUserNames[] = new String[2]; 
				String storingPasswords[] = new String[2];

				System.err.println("Welcome to User Registration!!");

				for (int i = 0; i < storingUserNames.length; i++) {
					System.out.println("Provide Username: ");
					String username = scanner.nextLine();

					boolean whenUserNameIsAlreadyexists = false; 

					for (int j = 0; j < i; j++) {
						if (username.equals(storingUserNames[j])) {
							whenUserNameIsAlreadyexists = true;
							break;
						}
						if (whenUserNameIsAlreadyexists) {
							System.out.println("Select new user name as it already recorded");
							i--;

						}
					}

					System.out.println("Provide password: ");
					String password = scanner.nextLine();

					storingUserNames[i] = username;
					storingPasswords[i] = password;
				}

				System.out.println("Registration successful!");

				int loginAttempts = 0;

				while (loginAttempts <= 3) {
					System.err.println("Welcome to Login:  ");

					System.out.print("Enter username: ");
					String username = scanner.nextLine();

					System.out.print("Enter password: ");
					String password = scanner.nextLine();

					boolean userNmaeAndPasswordMatch = false;

					for (int i = 0; i < storingUserNames.length; i++) {
						if (username.equals(storingUserNames[i]) && password.equals(storingPasswords[i])) {
							userNmaeAndPasswordMatch = true;
							System.out.println("Successful");
							break;
						} else
							System.out.println("Login Unsuccessful");

					}
					loginAttempts++;
				}

				System.err.println("Login attempts exceeded. Access denied.");

			}

		}

}

}
