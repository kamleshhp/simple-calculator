package FirstCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void TestEmptyString() {
		
		assertEquals(0,new SimpleCalculator().Add(""));
		
	}

}
