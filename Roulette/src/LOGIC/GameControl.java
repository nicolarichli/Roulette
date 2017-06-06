package LOGIC;

import java.util.ArrayList;

import DATA.DataTransmission;

public class GameControl{
	Wheel wheel = new Wheel();
	DataTransmission dataTransmission = new DataTransmission();
	ArrayList fields = new ArrayList<Field>();
	ArrayList settedChips = new ArrayList<Chip>();
	
	public void chipOnField(){
		
	}
	
	public boolean trueField(){
		return false;
	}
	
	public int getRundenzahl(){
		return 0;
	}
	
	public int getMoney(){
		return 0;
	}
	
	public String getName(){
		return "";
	}
	
	public void startRound(){
		
	}
}
