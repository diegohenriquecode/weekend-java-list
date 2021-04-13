package allQuestions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestThreeAdjustSalary {
	ThreeAdjustSalary adjustSalary = new ThreeAdjustSalary();

	@Test
	public void TestAdjustSalary() {
		Assert.assertEquals(("Should return 1010"),
			1010, adjustSalary.salaryReadjust(1000), 1010);
	}

}
