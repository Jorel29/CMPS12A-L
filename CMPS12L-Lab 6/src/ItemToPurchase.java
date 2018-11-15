class ItemToPurchase{
	//private fields such as itemName, itemPrice, and itemQuantity
	private String itemName = "none";
	private int itemPrice = 0;
	private int itemQuantity = 0;
	private String itemDescription;
	
	//default constructor
	ItemToPurchase(){
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
		itemDescription ="none";
	}
	ItemToPurchase(String n, String d, int p, int q){
		itemName = n;
		itemDescription = d;
		itemPrice = p;
		itemQuantity = q;
	}
	//setDesc method
	public void setDescription(String d) {
		itemDescription = d;
	}
	//getDesc
	public String getDescription() {
		return itemDescription;
	}
	//printItemCost
	public void printItemCost() {
		System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + itemPrice*itemQuantity);
	}
	public void printItemDescription() {
		System.out.println(itemName + ": " + itemDescription);
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