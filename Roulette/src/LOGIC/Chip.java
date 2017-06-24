package LOGIC;

public class Chip {
	private Field place;
	private int money;
	
	// Konstruktor, Platz und Geld werden übergeben.
	public Chip(Field place, int money){
		this.place = place;
		this.money = money;
	}
	
	// Getter von Field
	public Field getField(){
		return place;
	}
	
	// Getter von money
	public int getSettedMoney(){
		return money;
	}
}
