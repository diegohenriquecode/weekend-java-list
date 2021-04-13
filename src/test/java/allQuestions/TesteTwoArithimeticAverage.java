package allQuestions;

import org.junit.Assert;
import org.junit.Test;

import allQuestions.TwoArithmeticAverage;

public class TesteTwoArithimeticAverage {
	TwoArithmeticAverage arithmeticAverage = new TwoArithmeticAverage();
	
	@Test
	public void TestTreeNumbersSimpleAverage() {
		Assert.assertEquals(
			("Should return the number 3, no string"),
			8, arithmeticAverage.treeNumbersSimpleAvegare(8, 9, 7) 
		);
	}
	
	@Test
	public void TestOthersTreeNumbersSimpleAverage() {
		Assert.assertEquals(
			("Should return the number 5, no string"),
			5, arithmeticAverage.othersTreeNumbersSimpleAvegare(4, 5, 6) 
		);
	}
	
	@Test
	public void TestSumOfTwoAverage() {
		Assert.assertEquals(("Should return 13"), 13, 
				arithmeticAverage.sumOfAverage(8, 3));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestAverageOfAverage() {
		Assert.assertEquals(("Should return 6.5"),
				6.5, arithmeticAverage.averageOfAverage(8, 5), 6.5);
	}
}
