import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
	static User current_user = null;
	static boolean has_admin = false;
	static List<Object> properties = new ArrayList<Object>();
	
	public static void add(String name, int price, int count){
			properties.add(new Object(name, price, count));
	}

	public static void main(String[] args) {
		
		while(authentication.input!=9) {
		authentication.get_user();
		if(current_user.is_admin) {
		Admin current_admin = (Admin)current_user;
		has_admin=true;
		current_admin.show_menu();
		}
		else {
		public_user current_public = (public_user) current_user;
		current_public.show_menu();
		
		}
		
		}
	}
}
