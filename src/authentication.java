import java.util.Scanner;

public class authentication {
	static int input;
	Scanner sc = new Scanner(System.in);
	static public void get_user() {
		System.out.println("Welcome! \n Enter the proper input: \n 1 for sign up. \n 2 for log in");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		switch (input){
		case 1:
			if(Store.has_admin) {
				System.out.print("Enter your username:");
				String usrn = sc.next();
				System.out.print("Enter your password:");
				String pass = sc.next();
				System.out.println("Enter your name:");
				String name = sc.next();
				System.out.println("Enter your number:");
				String num = sc.next();
				public_user new_user = new public_user(usrn,pass,name,num);
				Store.current_user = new_user;
			}
			else {
				System.out.println("Enter your username:");
				String usrn = sc.next();
				System.out.println("Enter your password:");
				String pass = sc.next();
				System.out.println("Enter your name:");
				String name = sc.next();
				System.out.println("Enter your number:");
				String num = sc.next();
				Admin new_user = new Admin(usrn,pass,name,num);
				Store.current_user = new_user;
			}
			break;
		case 2:
			get_uspass();
			break;
		default:
			get_user();
			
		}
	}
	static public User check(String username, String password) {
		for(User usr : User.users) {
			if(usr.username.equalsIgnoreCase(username) && usr.password.equalsIgnoreCase(password) ) {
				return usr;
				}
		}
		return null;
	}
	static void get_uspass(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your username:");
	String usrn = sc.next();
	System.out.println("Enter your password:");
	String pass = sc.next();
	Store.current_user = authentication.check(usrn, pass);
	if (Store.current_user == null) {
		System.out.println("Your username or password is not correct!");
		get_user();
	}}
}
