import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	 Scanner sc = new Scanner(System.in);
	static List<User> users = new ArrayList<User>();
    String username;
	String password;
	String name;
	String number;
	boolean is_admin = false;
	public static void menu() {
		System.out.println("Enter the proper input: \n 1 for changing your info \n  for log out!");
	}
	User(){
		
	}
//	User(String username,String password,String name,String number){
//		users.add(this);
//		this.username = username;
//		this.password = password;
//		this.number = number;
//		this.name = name;
//	}
//	
	 void change_info(){
		System.out.println("which one do you want to change? \n 1.username \n 2.password \n 3.name \n 4.phone \n 5.Exit");
		int input1 = sc.nextInt();
		switch (input1) {
		case 1:
			System.out.println("Enter your new username");
			this.username = sc.next();
			System.out.println("Changed successfully");
			change_info();
			break;
		case 2:
			System.out.println("Enter your new password");
			this.password = sc.next();
			System.out.println("Changed successfully");
			change_info();
			break;
		case 3:
			System.out.println("Enter your new name");
			this.name = sc.next();
			System.out.println("Changed successfully");
			change_info();
			break;
		case 4:
			System.out.println("Enter your new phone");
			this.number = sc.next();
			System.out.println("Changed successfully");
			change_info();
			break;
		case 5:
			break;
		default:
			change_info();
			break;
		}}
}
