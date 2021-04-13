package allQuestions;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class TestFiveHowManySalaries {
	FiveHowManySalaries five = new FiveHowManySalaries();

	Scanner sc = new Scanner(System.in);
	
	float userSalary = five.getUserSalary(sc.nextFloat());
	float minimunSalary = five.getSalary(sc.nextFloat());
	
	float howManySalaries = userSalary / minimunSalary;
	
	@Test
	public void TesteFive() {		
		Assert.assertEquals(howManySalaries, 
		five.setHowManySalaries(userSalary, minimunSalary), howManySalaries);
	}

}
