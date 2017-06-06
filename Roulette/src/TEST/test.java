package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import LOGIC.GameControl;
import LOGIC.Wheel;

public class test {

	@Test
	public void test() {
		Wheel w = new Wheel();
		assertTrue(w.randNumber(0, 36) >= 0);
		assertTrue(w.randNumber(0, 36) <= 36);
	}

}
