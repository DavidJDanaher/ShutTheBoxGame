package shutTheBox;



/** SHUT THE BOX
 * 
 * Game Rules:
 * Numbers 1-9 on tokens are all stood up to begin. User rolls two dice to start.  The number rolled, 
 * or 'pip', is to be 'put away', or a set of numbers whose sum is that number, i.e. 11 rolled could 
 * be '2' and '9' or '7', '3', and '1'.  The user continues to roll dice until he or she can no longer 
 * put any more numbers away.  The user's score is the sum of the remaining numbers.  Two dice are 
 * rolled until '7', '8', and '9' have all been put away, at which point the user may roll one die or two.  
 */

import java.util.ArrayList;
import java.util.List;

public class GameController {
	
	
	public static List<ArrayList<Integer>> calculatePossibleSums(int rollValue) {
		GameBoard board = new GameBoard();
		board.initializeValues();
		ArrayList<Integer> availableNumbers = board.getGameState();
		List<ArrayList<Integer>> sums = new ArrayList<ArrayList<Integer>>();
		int n = 1;
		int m = 1;
						

		if (availableNumbers.contains(rollValue)) {
			ArrayList<Integer> singlet = new ArrayList<Integer>();

			singlet.add(rollValue);
			sums.add(singlet);
		}
		
		while (rollValue - n > n) {
			ArrayList<Integer> sumDoublet = new ArrayList<Integer>();

			if (availableNumbers.contains(rollValue-n) && availableNumbers.contains(n)){
				sumDoublet.add(rollValue - n);
				sumDoublet.add(n);
				sums.add(sumDoublet);
			}
			n++; 
		}
		
		if (rollValue > 5) {
			while (m < 3) {
				n = 2;
				while (rollValue - n - m > n) {
					if (n > m) {
						ArrayList<Integer> sumTriplet = new ArrayList<Integer>();
						if (availableNumbers.contains(rollValue - n - m) && 
								availableNumbers.contains(n) &&
								availableNumbers.contains(m)) {
									sumTriplet.add(rollValue - n - m);
									sumTriplet.add(n);
									sumTriplet.add(m);
									sums.add(sumTriplet);
							}
						}
					n++;
					}
				m++;
				}
			}

		System.out.println(sums);
		return sums;
	}
	
}



