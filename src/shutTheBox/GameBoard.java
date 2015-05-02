package shutTheBox;

import java.util.ArrayList;

public class GameBoard {
	private static final int NUM_OF_TILES = 9;
	ArrayList<Integer> gameTiles = new ArrayList<Integer>();
	
	public void initializeValues() {
		for (int n = 1; n <= NUM_OF_TILES; n++) {
			gameTiles.add(n);
		}
	}
	
	public void removeValue(int value){
		int indexToRemove = gameTiles.indexOf(value);
		gameTiles.remove(indexToRemove);
	}
	
	public ArrayList<Integer> getGameState() {
		return gameTiles;
		
	}
		
}