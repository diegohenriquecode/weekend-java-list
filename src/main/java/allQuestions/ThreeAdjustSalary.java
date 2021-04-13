package allQuestions;

import java.util.Scanner;

public class ThreeAdjustSalary {
	public float salaryReadjust(float salary) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Salário: "); 
		float userSalary = sc.nextFloat();
		
		float userAdjustedSalary = (float) (userSalary + (userSalary*0.01));
		
		return userAdjustedSalary;
	}
}
