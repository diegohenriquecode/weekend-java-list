package allQuestions;

public class TwoArithmeticAverage {
	public int treeNumbersSimpleAvegare(int a, int b, int c) {
		int simpleAverage = ((a+b+c)/3);
		
		return simpleAverage;
	}
	
	public int othersTreeNumbersSimpleAvegare(int a, int b, int c) {
		int otherSimpleAverage = ((a+b+c)/3);
		
		return otherSimpleAverage;
	}
	
	public int sumOfAverage(int average, int otherAverage) {
		
		return treeNumbersSimpleAvegare(8,9,7) + othersTreeNumbersSimpleAvegare(4,5,6);
	}
	
	public double averageOfAverage(float average, float otherAverage) {
		return (treeNumbersSimpleAvegare(8,9,7) + othersTreeNumbersSimpleAvegare(4,5,6)) / 2;
	}

}
