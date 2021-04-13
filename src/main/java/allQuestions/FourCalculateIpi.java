package allQuestions;

import java.util.Scanner;

public class FourCalculateIpi {
	Scanner sc = new Scanner(System.in);
	float percent; int id; float value; int amount;
	
	public float constructor(float a, int b, float c, int d, int e, float f, int g) {
		System.out.print("Porcentagem % do IPI a ser acescido no valor das peças: ");
		this.percent = sc.nextFloat();
		
		System.out.print("Código da peça 01: ");
		this.id = sc.nextInt();
		
		System.out.print("Valor da peça 01: ");
		this.value = sc.nextFloat();
		
		System.out.print("Quantidade de peças: ");
		this.amount = sc.nextInt();
		
		float stepOneForumla = (this.value * this.amount);
		
		//About second product		
		System.out.print("Código da peça 02: ");
		this.id = sc.nextInt();
		
		System.out.print("Valor da peça 02: ");
		this.value = sc.nextFloat();
		
		System.out.print("Quantidade de peças: ");
		this.amount = sc.nextInt();
		
		float stepTwoFormula = (this.value * this.amount);
		
		return (stepOneForumla + stepTwoFormula) * (this.percent/100 + 1);
	}
}
