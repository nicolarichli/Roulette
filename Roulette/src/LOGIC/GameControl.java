package LOGIC;

import java.util.ArrayList;
import DATA.*;


public class GameControl{
	Wheel wheel = new Wheel();
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Chip> settedChips = new ArrayList<Chip>();
	DataTransmission data = new Data();
	
	int randomNumber;
	
	public void chipOnField(Chip chip){
		settedChips.add(chip);
	}
	
	public boolean trueField(Chip chip){
		if(chip.getField().getNumberField() >= 0){
			if (randomNumber == chip.getField().getNumberField()){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	
	public int getRound(){
		return data.getRound();
	}
	
	public int getMoney(){
		return data.getMoney();
	}
	
	public void setMoney(int money){
		data.setMoney(money);
	}
	
	public String getName(){
		return data.getName();
	}
	
	public void setName(String playerName){
		String name = playerName;
		data.setName(name);
	}
	
	public void startRound(){
		randomNumber = wheel.randNumber(0, 36);
		for(Chip c : settedChips){
			if(trueField(c)){
				data.setMoney(getMoney() + c.getSettedMoney() * c.getField().getMultiplikator());
			}
		}
	}
	
	public void implementField(Field field){
		fields.add(field);
	 }
	
	public void implementChip(Chip chip){
		settedChips.add(chip);
	}
	
}
