
public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ItemToPurchase[] items;
	private int count;
	ShoppingCart(){
		customerName = "none";
		currentDate = "January 1, 2016";
	}
	ShoppingCart(String n, String d){
		customerName = n;
		currentDate = d;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getDate() {
		return currentDate;
	}
	public void addItem(ItemToPurchase a) {
		
		if(count == 0) {
			items = new ItemToPurchase [1];
			items[0] = a;
			count++;
		} else {
			ItemToPurchase[] newItems = new ItemToPurchase [items.length+1]; 
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			newItems[newItems.length-1] = a;
			items = new ItemToPurchase [newItems.length];
			for (int i = 0; i < newItems.length;i++ ) {
				items[i] = newItems[i];
			}
		}
	}
	public void removeItem(String a) {
		for (int j = 0; j< items.length; j++) {
			if (items[j].getName().equals(a)) {
				ItemToPurchase[] newItems = new ItemToPurchase [items.length-1];
				for (int i = 0; i < items.length; i++) {
					if (items[i].getName().equals(a)) {
						newItems[i] = items[i+1];
						i++;
					} else if (i == newItems.length-1) {
						newItems[i] = items[i];
					} else {
						newItems[i] = items[i];
					}
				}
				items = new ItemToPurchase [newItems.length];
				for(int i = 0; i < items.length; i++) {
					items[i] = newItems[i];
				}
			} else if (j == items.length-1) {
				System.out.println("Item not found in cart. Nothing removed.");
			}
		}
	}
	public void modifyItem(ItemToPurchase a) {
		for (int j = 0; j < items.length; j++) {
			if (items[j].getName().equals(a.getName())) {
				if (!(a.getName().equals("none"))) {
					items[j].setName(a.getName());
				}
				if (!(a.getDescription().equals("none"))) {
					items[j].setDescription(a.getDescription());
				}
				if(!(a.getQuantity() == 0)) {
					items[j].setQuantity(a.getQuantity());
				}
			}else if (j == items.length-1) {
				System.out.println("Item not found in cart. Nothing modified.");
			}
		}
	}
	public int getNumItemsInCart() {
		int totalQuantity = 0;
		if(count != 0) {
			for(int i = 0; i < items.length; i++) {
				totalQuantity += items[i].getQuantity();
			}
		}
		return totalQuantity;
	}
	public int getCostOfCart() {
		int totalCost = 0;
		if(count != 0) {
			for (int i = 0; i < items.length; i++) {
				totalCost += items[i].getPrice()*items[i].getQuantity();
			}
		}
		return totalCost;
	}
	public void printTotal() {
		int total = 0;
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items: " + getNumItemsInCart() + "\n");
		if (count != 0) {
			for (int i = 0; i < items.length; i++) {
				items[i].printItemCost();
				total += items[i].getPrice()*items[i].getQuantity();  
			}
		}else {
			System.out.println("SHOPPING CART IS EMPTY");
		}
		System.out.println("\nTotal: $" + total);
	}
	public void printDesctriptions() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("\nItem Descriptions");
		for (int i = 0; i < items.length; i++) {
			items[i].printItemDescription();
		}
	}
}
