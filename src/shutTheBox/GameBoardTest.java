package shutTheBox;

import java.util.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class GameBoardTest extends TestCase{
	GameBoard board = new GameBoard();
	
	
	@Test
	public void testSize() throws Exception {
		board.initializeValues();
		assertEquals("Size of array", 9 , board.getGameState().size());
	}
	
	public void testInitialize() throws Exception {
		board.initializeValues();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1 ; i < 10 ;  i++){
			numbers.add(i);
		}
		assertEquals("Numbers withing array", numbers ,board.getGameState());
	}
	
	public void testRemoveSingle() throws Exception {
		board.initializeValues();

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1 ; i < 10 ;  i++){
			numbers.add(i);
		}
		
//		numbers.remove(0);
//		board.removeValue(1);
		numbers.remove(4);
		board.removeValue(5);
		
		System.out.println("Test: "+ numbers + '\n' + board.getGameState());
	
		assertEquals("Numbers withing array", numbers , board.getGameState());
	}
	
	public void testRemoveMultiple() throws Exception {
		board.initializeValues();

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1 ; i < 10 ;  i++){
			numbers.add(i);
		}
		
		numbers.remove(0);
		board.removeValue(1);
		numbers.remove(3);
		board.removeValue(5);
		numbers.remove(6);
		board.removeValue(9);
		
		System.out.println("Test: "+ numbers + '\n' + board.getGameState());
	
		assertEquals("Numbers withing array", numbers , board.getGameState());
	}

}
