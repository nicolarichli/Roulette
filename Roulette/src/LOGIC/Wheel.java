package LOGIC;

import java.util.Random;

/**
 * @author Nicola Richli, Tobias Meier
 * @version 1.0
 */
public class Wheel {
	// neues Random-Objekt
	Random rand = new Random();
	
	/**
	 * Zufalls-Zahl
	 * @param min
	 * @param max
	 * @return rand.nextInt(max-min) + min
	 */
	public int randNumber(int min, int max){
		return rand.nextInt(max-min) + min;
	}
}
