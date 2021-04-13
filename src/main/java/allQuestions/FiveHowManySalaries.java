package allQuestions;

import java.util.Scanner;

public class FiveHowManySalaries {
	Scanner sc = new Scanner(System.in);
	
	public float userSalary;
	public float minimunSalary;
	public float howManySalaries;
	
	public float getSalary(float minimunSalary) {
//		System.out.print("Informe o salário mínimo atual: ");
		return this.minimunSalary = minimunSalary;
	}
	
	public float getUserSalary(float userSalary) {
//		System.out.print("Informe o seu salário atual: ");
		return this.userSalary = userSalary;
	}
	
	public float setHowManySalaries(float minimunSalary, float userSalary) {
		this.howManySalaries = this.userSalary / this.minimunSalary;
		System.out.print("Você recebe "+this.howManySalaries+" salário(s) mínimo(s)");
		
		return this.howManySalaries;
	}
}
