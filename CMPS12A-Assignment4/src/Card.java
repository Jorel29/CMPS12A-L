
public class Card {
	private int [][]numbers = new int[5][5];
	private boolean [][]isMarked = new boolean[5][5];
	
	public Card(int [][]numbers) {
		for (int i = 0; i < numbers.length;i++) {
			for (int j = 0; j < numbers[i].length;j++) {
				this.numbers[i][j] = numbers[i][j];
				isMarked[i][j] = false;
			}
		}
	}
	public void markNumber(int number) { // something wrong here
		for (int i = 0; i < isMarked.length; i++) {
			for (int j = 0; j < isMarked[i].length;j++) {
				if (numbers[i][j] == number) {
					isMarked[i][j] = true;
				}
			}
		}
	}
	public boolean isMarked(int row, int column) {
		if (isMarked[row][column] == true) {
			return true;
		}else {
			return false;
		}
	}
	public int getNumber(int row, int column) {
		return numbers[row][column];
	}
	
}
