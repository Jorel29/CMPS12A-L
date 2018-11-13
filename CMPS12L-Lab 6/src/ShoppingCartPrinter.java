import java.util.Scanner;

public class ShoppingCartPrinter{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int totalCost = 0;
	int totalItemCost = 0;
	//instantiate two objects of ItemToPurchase
	//print properties of the objects in the specified format
	ItemToPurchase [] items = new ItemToPurchase [2];
	for (int i = 0; i < items.length; i++) {
		System.out.println("Item " + (i+1));
		System.out.println("Enter the item name:");
		items[i].setName(sc.nextLine());
		System.out.println("Enter the item price:");
		items[i].setPrice(sc.nextInt());
		System.out.println("Enter the item quantity:");
		items[i].setQuantity(sc.nextInt());
		System.out.println("\n");
	}
	
	//printing total cost of and list of items
	System.out.println("TOTAL COST");
	for (int i = 0; i < items.length; i++) {
		totalItemCost = items[i].getPrice() * items[i].getQuantity();
		System.out.println(items[i].getName()+ " "+ items[i].getQuantity()+ " @ $"+ items[i].getPrice() +" = $"+ totalItemCost);
		totalCost += totalItemCost;
	}
	System.out.println("Total: $" + totalCost);
	}
}