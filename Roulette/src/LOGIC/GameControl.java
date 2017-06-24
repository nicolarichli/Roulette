package LOGIC;

import java.util.ArrayList;
import DATA.*;


public class GameControl{
	// Felder werden erstellt
	Wheel wheel = new Wheel();
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Chip> settedChips = new ArrayList<Chip>();
	DataTransmission data = new Data();
	Chip isChip;
	
	int randomNumber;
	
	// ArrayList von Chips
	public void chipOnField(Chip chip){
		settedChips.add(chip);
	}
	
	// wird überprüft, ob chip auf richtigem Feld liegt
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
			if(randomNumber%2 == 0 && (chip.getField().getHalfField().equals("gerade") || chip.getField().getHalfField().equals("schwarz"))){
				return true;
			}
			else if(randomNumber%2 != 0 && (chip.getField().getHalfField().equals("ungerade") || chip.getField().getHalfField().equals("rot"))){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	// getter von Round
	public int getRound(){
		return data.getRound();
	}
	
	// setter von Round
	public void setRound(int round){
		data.setRound(round);
	}
	
	// getter von Money
	public int getMoney(){
		return data.getMoney();
	}
	
	// setter von Money
	public void setMoney(int money){
		data.setMoney(money);
	}
	
	public String getName(){
		return data.getName();
	}
	
	public void setName(String playerName){
		data.setName(playerName);
	}
	
	public void startRound(){
		randomNumber = wheel.randNumber(0, 36);
		setRound(getRound() + 1);
		for(Chip c : settedChips){
			if(trueField(c)){
				data.setMoney(getMoney() + c.getSettedMoney() * c.getField().getMultiplikator());
			}
		}
		settedChips.clear();
	}
	
	public void implementField(Field field){
		fields.add(field);
	 }
	
	public void implementChip(Chip chip){
		settedChips.add(chip);
	}
	
	public int getRandom(){
		return randomNumber;
	}
	
	public boolean gameEnd(){
		if(getRound() >= 10 || getMoney() <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	
}
