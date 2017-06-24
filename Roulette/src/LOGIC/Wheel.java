package LOGIC;

import java.util.Random;

public class Wheel {
	// neues Random-Objekt
	Random rand = new Random();
	
	// Zufallsnummer zwischen min und max
	public int randNumber(int min, int max){
		return rand.nextInt(max-min) + min;
	}
}
