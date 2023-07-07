import java.util.Scanner;

public class Revisionloop {
	public static void main(String args[]) {
		int index = 0;
		boolean flag = false;
		int count = 1;

		String[] userNames = { "madhav", "sunil", "arbind" };

		String[] passwords = { "1234", "3456", "4444" };

		Scanner scanner = new Scanner(System.in);

		while (count <= 3) {
			System.out.println("Enter username");
			String uname = scanner.next();

			System.out.println("Enter password");
			String pass = scanner.next();

			for (int i = 0; i < userNames.length; i++) {
				if (userNames[i].equals(uname)) {
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





          