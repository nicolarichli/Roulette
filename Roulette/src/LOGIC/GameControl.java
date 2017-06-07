package LOGIC;

import java.util.ArrayList;
import DATA.*;

public class GameControl{
	Wheel wheel = new Wheel();
	ArrayList<Field> fields = new ArrayList<Field>();
	ArrayList<Chip> settedChips = new ArrayList<Chip>();
	Data data = new Data();
	
	public void chipOnField(int nrField, int money){
		Chip chip = new Chip(fields.get(nrField), money);
	}
	
	public void chipOnField(String halfField, int money){
		Chip chip = new Chip(n0, 10);
	}
	
	public boolean trueField(){
		return false;
	}
	
	public int getRound(){
		return data.getRound();
	}
	
	public int getMoney(){
		return data.getMoney();
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
	
	public void implementFields(){
		fields.add(n0);
		fields.add(n1);
		fields.add(n2);
		fields.add(n3);
		fields.add(n4);
		fields.add(n5);
		fields.add(n6);
		fields.add(n7);
		fields.add(n8);
		fields.add(n9);
		fields.add(n10);
		fields.add(n11);
		fields.add(n12);
		fields.add(n13);
		fields.add(n14);
		fields.add(n15);
		fields.add(n16);
		fields.add(n17);
		fields.add(n18);
		fields.add(n19);
		fields.add(n20);
		fields.add(n21);
		fields.add(n22);
		fields.add(n23);
		fields.add(n24);
		fields.add(n25);
		fields.add(n26);
		fields.add(n27);
		fields.add(n28);
		fields.add(n29);
		fields.add(n30);
		fields.add(n31);
		fields.add(n32);
		fields.add(n33);
		fields.add(n34);
		fields.add(n35);
		fields.add(n36);
		
		fields.add(hUn);
		fields.add(hGe);
		fields.add(hRed);
		fields.add(hBlack);
		
	 }
	
}
