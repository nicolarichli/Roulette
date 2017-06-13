package LOGIC;

public class Chip {
	private Field place;
	private int money;
	
	public Chip(Field place, int money){
		this.place = place;
		this.money = money;
	}
	
	public Field getField(){
		return place;
	}
}
