package revarture.math;

public class Calculator {
	public int sum(int num1, int num2) {
		int sum= num1+ num2;
		
		return sum;
	}
	public int betterSumMethod(int [] arrayOfInts) {
		int total=0;
		
		
		for(int i=0; i < arrayOfInts.length; i++ ) {
			total += arrayOfInts[i];
			
			
		}
		
		return total;
		
	
	
	}

}
