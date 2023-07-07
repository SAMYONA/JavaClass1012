import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		int index = 0;
		boolean flag = false;
		int count = 1;
		
		Scanner scanner = new Scanner(System.in);
		// registration
		
		//int num = scanner.nextInt();
		
		String[] usernames = new String[2];
		String [] passwords = new String[2];
		
		//input userName and passWord
		
		for(int i=0; i<usernames.length; i++) {
		System.out.println("ENTER USERNAME");
		String username = scanner.next();
		System.out.println("ENTER PASSWORD");
		String password = scanner.next();
		
		// checking username already exist
		boolean isUsernameExists =false;
		
		if(isUsernameExists) {
			System.out.println("username already exists");
		  i--;
		}else {
			usernames[i] = username;
			passwords[i] = password;
		}
		
	
		}
		System.out.println("registration sucessful");
		

		while (count <= 3) {
			System.out.println("Enter username");
			String uname = scanner.next();

			System.out.println("Enter password");
			String pass = scanner.next();

			for (int i = 0; i < usernames.length; i++) {
				if (usernames[i].equals(uname)) {
					index = i;

					if (pass.equals(passwords[index])) {
						System.out.println("Login successful");
						flag = true;
					}
				}
			}

			if (flag == false) {
				System.out.println("login failed");
			}
			if (flag == true) {
				break;
			}
			count++;
		}
	}
	
}
