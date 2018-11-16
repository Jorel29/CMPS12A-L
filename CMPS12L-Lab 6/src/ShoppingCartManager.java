import java.util.Scanner;

public class ShoppingCartManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Customer's Name:");
		String customerName = sc.nextLine();
		System.out.println("Enter Today's Date:");
		String date = sc.nextLine();
		ShoppingCart cart = new ShoppingCart(customerName, date);
		System.out.println("Customer Name: "+ cart.getCustomerName());
		System.out.println("Today's Date: " + cart.getDate());
		printMenu(cart, sc);
	}
	public static void printMenu(ShoppingCart c, Scanner s) {
		String name;
		String desc;
		int price;
		int quantity;
		System.out.println("MENU\na - Add item to cart\ndRemove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit\n\nChoose an option:");
		switch(s.nextLine().charAt(0)) {
			case 'q':
				break;
			case 'a':
				System.out.println("ADD ITEM TO CART\nEnter the item name:");
				name = s.nextLine();
				System.out.println("Enter the item description");
				desc = s.nextLine();
				System.out.println("Enter the item price:");
				price = s.nextInt();
				s.nextLine();
				System.out.println("Enter the item quantity:");
				quantity = s.nextInt();
				ItemToPurchase newItem = new ItemToPurchase(name, desc, price, quantity);
				c.addItem(newItem);
				printMenu(c, s);
				break;
			case 'd':
				System.out.println("REMOVE ITEM FROM CART\nEnter name of item to remove:");
				c.removeItem(s.nextLine());
				printMenu(c, s);
				break;
			case 'c':
				System.out.println("CHANGE ITEM QUANTITY\nEnter the item name:");
				ItemToPurchase modItem = new ItemToPurchase();
				modItem.setName(s.nextLine());
				System.out.println("Enter the new quantity");
				modItem.setQuantity(s.nextInt());
				c.modifyItem(modItem);
				printMenu(c, s);
				break;
			case 'i':
				System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
				c.printDesctriptions();
				printMenu(c, s);
				break;
			case 'o':
				System.out.println("OUTPUT SHOPPING CART");
				c.printTotal();
				printMenu(c, s);
				break;
			default:
				printMenu(c, s);
				break;
				
		}
	}
}
