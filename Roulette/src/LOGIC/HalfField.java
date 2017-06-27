package LOGIC;

/**
 * @author Nicola Richli, Tobias Meier
 * @version 1.0
 */
public class HalfField extends Field{
	private String name;
	
	public HalfField(String name){
		this.name = name;
	}
	
	public String getHalfField(){
		return name;
	}
	
	public int getMultiplikator(){
		return 2;
	}
}
