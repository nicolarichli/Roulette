package LOGIC;

import java.util.Random;

public class Wheel {
	Random rand = new Random();
	
	public int randNumber(int min, int max){
		return rand.nextInt(max-min) + min;
	}
}
