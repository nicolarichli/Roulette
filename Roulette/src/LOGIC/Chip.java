package LOGIC;

/**
 * @author Nicola Richli, Tobias Meier
 * @version 1.0
 */
public class Chip {
	private Field place;
	private int money;
	
	/**
	 * Konstruktor von Chip
	 * @param place
	 * @param money
	 */
	public Chip(Field place, int money){
		this.place = place;
		this.money = money;
	}
	
	/**
	 * getter von Field
	 * @return place
	 */
	public Field getField(){
		return place;
	}
	
	/**
	 * getter von Geld
	 * @return money
	 */
	public int getSettedMoney(){
		return money;
	}
}
