
public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ItemToPurchase[] items = new ItemToPurchase [1];
	private int count = 0;
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
		ItemToPurchase[] newItems = new ItemToPurchase [count++]; 
		for (int i = 0; i < items.length; i++) {
			newItems[i] = items[i];
		}
		newItems[newItems.length-1] = a;
		items = new ItemToPurchase [count];
		for (int i = 0; i < newItems.length;i++ ) {
			items[i] = newItems[i];
		}
	}
	public void removeItem(String a) {
		for (int j = 0; j< items.length; j++) {
			if (items[j].getName().equals(a)) {
				ItemToPurchase[] newItems = new ItemToPurchase [count--];
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
				items = new ItemToPurchase [count];
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
				if (!(items[j].getName().equals("none"))) {
					items[j].setName("none");
				}
				if (!(items[j].getDescription().equals("none"))) {
					items[j].setDescription("none");
				}
				if(!(items[j].getQuantity() == 0)) {
					items[j].setQuantity(0);
				}
			}else if (j == items.length-1) {
				System.out.println("Item not found in cart. Nothing modified");
			}
		}
	}
	public int getNumItemsInCart() {
		int totalQuantity = 0;
		for(int i = 0; i < items.length; i++) {
			totalQuantity += items[i].getQuantity();
		}
		return totalQuantity;
	}
	public int getCostOfCart() {
		int totalCost = 0;
		for (int i = 0; i < items.length; i++) {
			totalCost += items[i].getPrice()*items[i].getQuantity();
		}
		return totalCost;
	}
	public void printTotal() {
		int total = 0;
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items: " + getNumItemsInCart());
		for (int i = 0; i < items.length; i++) {
			items[i].printItemCost();
			total += items[i].getPrice()*items[i].getQuantity();  
		}
		System.out.println("Total: " + total);
	}
	public void printDesctriptions() {
		System.out.println(customerName + "'s Shopping Cart - " + currentDate);
		System.out.println("\nItem Descriptions:");
		for (int i = 0; i < items.length; i++) {
			items[i].printItemDescription();
		}
	}
}
