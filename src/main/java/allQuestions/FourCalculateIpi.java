package allQuestions;

import java.util.Scanner;

public class FourCalculateIpi {
	Scanner sc = new Scanner(System.in);
	
	public float percent; 
	public int id; 
	public float value; 
	public int amount;
	public float finalValue;
	
	public float getPercent(float ipi) {
		return this.percent = ipi;
	}
	
	public int getId(int productId) {
		return this.id = productId;
	}
	
	public float getValue(float productValue) {
		return this.value = productValue;
	}
	
	public int getAmount(int productAmount) {
		return this.amount = productAmount;
	}
	
	public float setFinalValue(
			float finalValueOne,
			float finalValueTwo
		) 
	{
		this.finalValue = 
		(finalValueOne) 
		+ (finalValueTwo) 
		/ (percent/100 + 1);
		
		return this.finalValue;
	}
}
