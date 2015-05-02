package shutTheBox;

import java.util.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

import static shutTheBox.GameController.calculatePossibleSums;

public class GameControllerTest extends TestCase {
	
	
	private List<ArrayList<Integer>> list(ArrayList... arrays){
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (ArrayList a : arrays)
			list.add(a);
		System.out.print("Test: " + list + '\n' + "Game: ");
		return list;
	}
	@Test
	
	public void testOne() throws Exception {
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(1);
		assertEquals(list(one), calculatePossibleSums(1));
	}
	
	public void testTwo() throws Exception{
		ArrayList<Integer> two = new ArrayList<Integer>();
		two.add(2);
		assertEquals(list(two), calculatePossibleSums(2));
	}
	
	public void testThree() throws Exception{
		ArrayList<Integer> three = new ArrayList<Integer>();
		ArrayList<Integer> sumThree = new ArrayList<Integer>();
		three.add(3);
		sumThree.add(2);
		sumThree.add(1);
		assertEquals(list(three, sumThree), calculatePossibleSums(3));
	}
	
	public void testFour() throws Exception{
		ArrayList<Integer> four = new ArrayList<Integer>();
		ArrayList<Integer> sumFour = new ArrayList<Integer>();
		four.add(4);
		sumFour.add(3);
		sumFour.add(1);
		assertEquals(list(four, sumFour), calculatePossibleSums(4));
	}
	
	public void testFive() throws Exception{
		ArrayList<Integer> five = new ArrayList<Integer>();
		ArrayList<Integer> sumFive_1 = new ArrayList<Integer>();
		ArrayList<Integer> sumFive_2 = new ArrayList<Integer>();
		
		five.add(5);
		sumFive_1.add(4);
		sumFive_1.add(1);
		sumFive_2.add(3);
		sumFive_2.add(2);
		
		assertEquals(list(five, sumFive_1, sumFive_2), calculatePossibleSums(5));
	}
	
	public void testSix() throws Exception{
		ArrayList<Integer> six = new ArrayList<Integer>();
		ArrayList<Integer> sumSix_1 = new ArrayList<Integer>();
		ArrayList<Integer> sumSix_2 = new ArrayList<Integer>();
		ArrayList<Integer> sumSix_3 = new ArrayList<Integer>();

		six.add(6);
		sumSix_1.add(5);
		sumSix_1.add(1);
		sumSix_2.add(4);
		sumSix_2.add(2);
		sumSix_3.add(3);
		sumSix_3.add(2);
		sumSix_3.add(1);
		
		assertEquals(list(six, sumSix_1, sumSix_2, sumSix_3), calculatePossibleSums(6));	
	}
	
	public void testSeven() throws Exception{
		ArrayList<Integer> seven = new ArrayList<Integer>();
		ArrayList<Integer> sumSeven_1 = new ArrayList<Integer>();
		ArrayList<Integer> sumSeven_2 = new ArrayList<Integer>();
		ArrayList<Integer> sumSeven_3 = new ArrayList<Integer>();
		ArrayList<Integer> sumSeven_4 = new ArrayList<Integer>();
		
		seven.add(7);
		sumSeven_1.add(6);
		sumSeven_1.add(1);
		sumSeven_2.add(5);
		sumSeven_2.add(2);
		sumSeven_3.add(4);
		sumSeven_3.add(3);
		sumSeven_4.add(4);
		sumSeven_4.add(2);
		sumSeven_4.add(1);
		
		assertEquals(list(seven, sumSeven_1, sumSeven_2, sumSeven_3, sumSeven_4), calculatePossibleSums(7));	
	}
	
	public void testEight() throws Exception {
		ArrayList<Integer> eight = new ArrayList<Integer>();
		ArrayList<Integer> sumEight_1 = new ArrayList<Integer>();
		ArrayList<Integer> sumEight_2 = new ArrayList<Integer>();
		ArrayList<Integer> sumEight_3 = new ArrayList<Integer>();
		ArrayList<Integer> sumEight_4 = new ArrayList<Integer>();
		ArrayList<Integer> sumEight_5 = new ArrayList<Integer>();
		
		eight.add(8);
		sumEight_1.add(7);
		sumEight_1.add(1);
		sumEight_2.add(6);
		sumEight_2.add(2);
		sumEight_3.add(5);
		sumEight_3.add(2);
		sumEight_3.add(1);
		sumEight_4.add(5);
		sumEight_4.add(3);
		sumEight_5.add(4);
		sumEight_5.add(3);
		sumEight_5.add(1);
		
		assertEquals(list(eight, sumEight_1, sumEight_2, sumEight_4, sumEight_3, sumEight_5 ), calculatePossibleSums(8));
	}
	
public void testNine() throws Exception {
	ArrayList<Integer> nine = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_1 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_2 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_3 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_4 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_5 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_6 = new ArrayList<Integer>();
	ArrayList<Integer> sumNine_7 = new ArrayList<Integer>();

	
	nine.add(9);
	sumNine_1.add(8);
	sumNine_1.add(1);
	
	sumNine_2.add(7);
	sumNine_2.add(2);
	
	sumNine_3.add(6);
	sumNine_3.add(3);
	
	sumNine_4.add(5);
	sumNine_4.add(4);
	
	sumNine_5.add(6);
	sumNine_5.add(2);
	sumNine_5.add(1);
	
	sumNine_6.add(5);
	sumNine_6.add(3);
	sumNine_6.add(1);
	
	sumNine_7.add(4);
	sumNine_7.add(3);
	sumNine_7.add(2);

	assertEquals(list(nine, sumNine_1, sumNine_2, sumNine_3, sumNine_4, sumNine_5, sumNine_6, sumNine_7), calculatePossibleSums(9));
	}	

public void testTen() throws Exception {
	ArrayList<Integer> ten = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_1 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_2 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_3 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_4 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_5 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_6 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_7 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_8 = new ArrayList<Integer>();
	ArrayList<Integer> sumTen_9= new ArrayList<Integer>();
	ArrayList<Integer> sumTen_10 = new ArrayList<Integer>();
	
	
	sumTen_1.add(9);
	sumTen_1.add(1);
	
	sumTen_2.add(8);
	sumTen_2.add(2);
	
	sumTen_3.add(7);
	sumTen_3.add(3);
	
	sumTen_4.add(6);
	sumTen_4.add(4);
	
	sumTen_5.add(7); 
	sumTen_5.add(2);
	sumTen_5.add(1);
	
	sumTen_6.add(6);
	sumTen_6.add(3);
	sumTen_6.add(1);
	
	sumTen_7.add(5);
	sumTen_7.add(4);
	sumTen_7.add(1);
	
	sumTen_8.add(5);
	sumTen_8.add(3);
	sumTen_8.add(2);
	
	sumTen_9.add(4);
	sumTen_9.add(3);
	sumTen_9.add(2);
	sumTen_9.add(1);

	
	assertEquals(list( sumTen_1, sumTen_2, sumTen_3, sumTen_4, sumTen_5, sumTen_6, sumTen_7, sumTen_8, sumTen_9), calculatePossibleSums(10));
	
}
public void testEleven() throws Exception {
	
}
public void testTwelve() throws Exception {
	
}


}
