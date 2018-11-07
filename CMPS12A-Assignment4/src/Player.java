
public class Player {
	private Card[] cards;
	private String name = "NoName";
	private boolean isWinner = false;
	
	public Player(String name, Card[] cards) {
		this.cards = new Card[cards.length];
		for (int i = 0; i < cards.length; i++) {
			this.cards[i] = cards[i];
		}
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean isWinner() {
		for (int i = 0; i < cards.length; i++) { // something wrong here 
			for (int r = 0; r < 5; r++ ) {
				int c = 0;
				while(isWinner == false) {
					if (cards[i].isMarked(r, c) == true) {
						c++;
						if (c == 4) {
							isWinner = true;
						}
					}else if (c == 4 && isWinner == false) {
						c = 0;
						break;
					}
				}
			}
		}
		return isWinner;
	}
	public void markNumber(int number) {
		for(int i = 0; i < cards.length; i++) {
			this.cards[i].markNumber(number);
		}
	}
}
