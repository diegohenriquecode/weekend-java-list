package allQuestions;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestFourCalculateIpi {
	FourCalculateIpi calculateIpi = new FourCalculateIpi();
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestFourCalculatorIpi() {
		Assert.assertEquals(220.0, 
				calculateIpi.constructor(10, 1, 100, 1, 2, 100, 1), 
				220.0);
	}

}
