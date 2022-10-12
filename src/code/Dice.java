/**
 * 
 */
package code;

import java.util.Random;

/**
 * @author zaki
 *
 */
public class Dice {

	
	/**
	 * this can be set using getter and setter can be an 8-side dice
	 */
	private int max = 6;
	
	
	public int rollDice() {
		Random r =new Random();
		return r.nextInt(max)+1;
	}
	
	

}
