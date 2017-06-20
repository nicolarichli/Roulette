package LOGIC;

public class NumberField extends Field {
	private int number;
	
	public int getMultiplikator(){
		return 37;
	}
	
	public int getNumberField(){
		return number;
	}
	
	public NumberField(int number){
		this.number = number;
	}
}
