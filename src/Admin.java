
public class Admin extends User{
	 public void show_menu() {
		System.out.println("Enter the proper input: \n 1 for add to store properties \n 2 for changing your info \n 3 for login out!!");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			System.out.println("How many types of objects do you want to add?");
			int number = sc.nextInt();
			for(int i = 0; i<number ; i++) {
				if(0<i) {
					System.out.println("Press enter key to continue.");
					try {
						System.in.read();
					}
					catch(Exception e) {}
					}
			System.out.println("Enter the name of object:");
			String name = sc.next();
			System.out.println("Enter the price of each object:");
			int price = sc.nextInt();
			System.out.println("How many:" + name + "do you want to add?");
			int count = sc.nextInt();
			Store.add(name, price, count);
			System.out.println("Added successfully");
			}
			show_menu()	;
			break;
		case 2:
			this.change_info();
			show_menu();
			break;
		case 3:
			System.out.println("Bye Bye");
			Store.current_user = null;
			break;
			
		default:
			System.out.println("\n Enter a valid input!");
			show_menu();
		}
	}
    void add() {
		// TODO Auto-generated method stub
		
	}
	Admin(String username,String password,String name,String number){
		users.add(this);
		this.username = username;
		this.password = password;
		this.number = number;
		this.name = name;
		this.is_admin = true;
	}
		
		}