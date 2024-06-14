import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class public_user extends User {
	int balance = 0;
	List<Object> cart = new ArrayList<Object>();
	public int addbalance(int amount) {
		this.balance += amount;
		System.out.println("Done!");
		return balance;
		
	}
	public int balance(int amount) {
		this.balance -= amount;
		return balance;
	}
	public int showbalance()
	{
		return balance;
	}
	public void show_menu() {
		System.out.println("Enter the proper input: \n 1 for go to the store \n 2 for view shopping cart "
				+ "\n 3 for recharge wallet \n 4 for wallet balance inquiry \n 5 for changing your info \n 6 for login out!!");
		int input = sc.nextInt();
		switch(input){
			case 1:
				int num = 0;
				for(Object obj : Store.properties) {
					System.out.println(++num + ". "+ obj.count + " " + obj.name +"\n Price:" + obj.price);
					System.out.println();
				}
				 System.out.println("Choose your item number from the list");
				 int in = sc.nextInt();
				 if(in<=num) {
					 Object item = Store.properties.get(in-1);
					 System.out.println("How many of "+ item.name +" do you want?");
					 int count = sc.nextInt();
					 int x =  item.price * count;
					 if(   item.count >= count) {
						 if(balance(count)>= x) {
							 add_cart(item,count);
							 balance(item.price);
						 }
						 else {
							 System.out.println("balance is insufficient");
							 System.out.println("Enter 1 for to chatge the wallet");
							 int n = sc.nextInt();
							 if( n == 1) {
								 System.out.println("How much do you add to the wallet?");
								 int amount = sc.nextInt();
								 addbalance(amount);
								 show_menu();

						 }}
					 show_menu();
					 }
					 else {
						 System.out.println("not enough available");
						 show_menu();
						 }
							show_menu();
					 }
				 
				 show_menu();
				break;
			case 2:
				int u = 0;
				for(Object obj : cart ) {
					System.out.println(++u + ". "+ obj.count + " " + obj.name);
					System.out.println();
				}
				 show_menu();
				break;
			case 3:
				System.out.println("How much do you add to the wallet?");
				int amount = sc.nextInt();
				addbalance(amount);
				 show_menu();

				break;
			case 4:
				System.out.println("balance: " + showbalance());
				show_menu();
				break;
			case 5:
				this.change_info();
				show_menu();
				break;
			case 6:
				System.out.println("Bye Bye");
				Store.current_user = null;
				break;
				
			default:
				System.out.println("\n Enter a valid input!");
				show_menu();
		}

	}
	
	public_user(String username,String password,String name,String number){
		users.add(this);
		this.username = username;
		this.password = password;
		this.number = number;
		this.name = name;
		
}
	
	public void add_cart(Object item, int count){
		if(item.count >= count) {
			cart.add(new Object(item.name,item.price,count));
			item.count -=count;
			System.out.println("Item added to cart.");
		}
		else {
			System.out.println("Item is out of stock.");
		}
		}
}