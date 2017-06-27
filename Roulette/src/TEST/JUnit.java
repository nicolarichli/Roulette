package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import LOGIC.Chip;
import LOGIC.Field;
import LOGIC.GameControl;
import LOGIC.HalfField;
import LOGIC.NumberField;
import LOGIC.Wheel;

public class JUnit {
	
	Wheel wheel = new Wheel();
	Field nf = new NumberField(13);
	Field hf = new HalfField("gerade");
	Chip chip = new Chip(nf, 0);
	Chip hChip = new Chip(hf, 0);
	GameControl gc = new GameControl();
	
	@Test
	public void test1() {
		assertTrue(wheel.randNumber(0, 36)<=36);
		assertTrue(wheel.randNumber(0, 36)>=0);
	}
	
	@Test
	public void test2() {
		assertTrue(nf.getNumberField()==chip.getField().getNumberField());
	}
	
	@Test
	public void test3(){
		assertTrue(hf.getHalfField().equals(hChip.getField().getHalfField()));
	}
	
}
