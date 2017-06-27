package LOGIC;

import java.util.ArrayList;
import DATA.*;

/**
 * @author Nicola Richli, Tobias Meier
 * @version 1.0
 */
public class GameControl{
	// Felder werden erstellt
	Wheel wheel = new Wheel();
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Chip> settedChips = new ArrayList<Chip>();
	DataTransmission data = new Data();
	Chip isChip;
	
	int randomNumber;
	
	/**
	 * Chips in ArrayList
	 * @param chip
	 */
	public void chipOnField(Chip chip){
		settedChips.add(chip);
	}
	
	/**
	 * Feld Richtig Kontrolle
	 * @param chip
	 * @return
	 */
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
	
	/**
	 * Getter von Round
	 * @return data.getRound
	 */
	public int getRound(){
		return data.getRound();
	}
	
	/**
	 * Setter von Round
	 * @param round
	 */
	public void setRound(int round){
		data.setRound(round);
	}
	
	/**
	 * Getter von Money
	 * @return data.getMoney()
	 */
	public int getMoney(){
		return data.getMoney();
	}
	
	/**
	 * Setter von Money
	 * @param money
	 */
	public void setMoney(int money){
		data.setMoney(money);
	}
	
	/**
	 * Getter von Name
	 * @return data.getName()
	 */
	public String getName(){
		return data.getName();
	}
	
	/**
	 * Setter von Nmae
	 * @param playerName
	 */
	public void setName(String playerName){
		data.setName(playerName);
	}
	
	/**
	 * Runde wird gestartet, Runde um 1 erhöht und Kontrolliert, welche Chips richtig sind
	 */
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
	
	/**
	 * Felder werden in ArrayList gegeben
	 * @param field
	 */
	public void implementField(Field field){
		fields.add(field);
	 }
	
	/**
	 * Chips werden zu gesetzten Chips hinzugefügt
	 * @param chip
	 */
	public void implementChip(Chip chip){
		settedChips.add(chip);
	}
	
	/**
	 * Getter von Random
	 * @return
	 */
	public int getRandom(){
		return randomNumber;
	}
	
	/**
	 * Spiel fertig
	 * @return boolean
	 */
	public boolean gameEnd(){
		if(getRound() >= 10 || getMoney() <= 0){
			return true;
		}
		else{
			return false;
		}
	}
	
}
