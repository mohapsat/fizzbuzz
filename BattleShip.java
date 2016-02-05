public class BattleShip {

	private int userGuess = 0;
	//private int [] ship = {'1','2','3'};
	private	int [] gameGrid = {'1','2','3','4','5','6','7'};

	public void setUserGuess (int num) {
		userGuess = num;
	}
	
	public int getUserGuess () {
		return userGuess;
	}

	public void setGameGrid (int[] arr) {
	
		gameGrid = arr;
	
	}
	
	public int[] getGameGrid () {
	
		return gameGrid;
	}


}
