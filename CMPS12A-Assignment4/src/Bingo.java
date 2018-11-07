

public class Bingo {
	private Player[]players;
	private String winners = "";
	
	public Bingo(Player[] p) {
		this.players = new Player[p.length];
		for (int i = 0; i < p.length; i++) {
			this.players[i] = p[i];
		}
	}
	
	public String play(int number) {
		for (int i = 0; i < players.length; i++) {
			players[i].markNumber(number);
			if (players[i].isWinner() == true) {
				winners = winners + players[i].getName() + " ";
			} 
		}
		return winners;
	}
}
