class ItemToPurchase{
	//private fields such as itemName, itemPrice, and itemQuantity
	private String itemName = "none";
	private int itemPrice = 0;
	private int itemQuantity = 0;
	
	//default constructor
	ItemToPurchase(){
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	//setName method
	public void setName(String n) {
		itemName = n;
	}
	//getName method
	public String getName() {
		return itemName;
	}
	//setPrice method
	public void setPrice(int p) {
		itemPrice = p;
	}
	//getPrice method
	public int getPrice() {
		return itemPrice;
	}
	//setQuantity method
	public void setQuantity(int q) {
		itemQuantity = q;
	}
	//getQuantity method
	public int getQuantity() {
		return itemQuantity;
	}
}