package allQuestions;

import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestFourCalculateIpi {
	Scanner sc = new Scanner(System.in);
	
	float value;
	int amount;
	float percent;
	float finalValue;
	float finalValueOne;
	float finalValueTwo;
	
	FourCalculateIpi productOne = new FourCalculateIpi();
	FourCalculateIpi productTwo = new FourCalculateIpi();
	
	
	@Test
	public void TestFourCalculatorIpi() {
		System.out.print("IPI: ");
		percent = productOne.getPercent(sc.nextFloat());
		
		System.out.println("Primeiro produto");
		
		System.out.print("Código do produto: ");
		productOne.getId(sc.nextInt());
		
		System.out.print("Valor: ");
		value = productOne.getValue(sc.nextFloat());
		
		System.out.print("Quantidade: ");
		amount = productOne.getAmount(sc.nextInt());
		
		finalValueOne = value * amount;
		
		System.out.println("Segundo produto");
		
		System.out.print("Código do produto: ");
		productTwo.getId(sc.nextInt());
		
		System.out.print("Valor: ");
		value = productTwo.getValue(sc.nextFloat());
		
		System.out.print("Quantidade: ");
		amount = productTwo.getAmount(sc.nextInt());
		
		finalValueTwo = value * amount;
		
		finalValue = productOne.setFinalValue(finalValueOne, finalValueTwo);
		
		Assert.assertEquals(
				finalValue, 
				productOne.setFinalValue(finalValueOne, finalValueTwo),
				finalValue
		);
	}

}
