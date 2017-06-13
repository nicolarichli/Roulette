package LOGIC;

import java.util.ArrayList;
import DATA.*;


public class GameControl{
	Wheel wheel = new Wheel();
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Chip> settedChips = new ArrayList<Chip>();
	DataTransmission data = new Data();
	
	public void chipOnField(Chip chip){
		settedChips.add(chip);
	}
	
	public void chipOnField(String halfField, int money){
		Chip chip = new Chip(n0, 10);
		settedChips.add(chip);
	}
	
	public boolean trueField(Chip chip){
		
		return false;
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
		wheel.randNumber(0, 36);
		for(Chip c : settedChips){
			if(trueField(c)){
				
			}
		}
	}
	
	Field n0 = new NumberField();
	Field n1 = new NumberField();
	Field n2 = new NumberField();
	Field n3 = new NumberField();
	Field n4 = new NumberField();
	Field n5 = new NumberField();
	Field n6 = new NumberField();
	Field n7 = new NumberField();
	Field n8 = new NumberField();
	Field n9 = new NumberField();
	Field n10 = new NumberField();
	Field n11 = new NumberField();
	Field n12 = new NumberField();
	Field n13 = new NumberField();
	Field n14 = new NumberField();
	Field n15 = new NumberField();
	Field n16 = new NumberField();
	Field n17 = new NumberField();
	Field n18 = new NumberField();
	Field n19 = new NumberField();
	Field n20 = new NumberField();
	Field n21 = new NumberField();
	Field n22 = new NumberField();
	Field n23 = new NumberField();
	Field n24 = new NumberField();
	Field n25 = new NumberField();
	Field n26 = new NumberField();
	Field n27 = new NumberField();
	Field n28 = new NumberField();
	Field n29 = new NumberField();
	Field n30 = new NumberField();
	Field n31 = new NumberField();
	Field n32 = new NumberField();
	Field n33 = new NumberField();
	Field n34 = new NumberField();
	Field n35 = new NumberField();
	Field n36 = new NumberField();
	
	Field hUn = new HalfField();
	Field hGe = new HalfField();
	Field hRed = new HalfField();
	Field hBlack = new HalfField();
	
	public void implementField(Field field){
		fields.add(field);
	 }
	
	public void implementChip(Chip chip){
		settedChips.add(chip);
	}
	
}
