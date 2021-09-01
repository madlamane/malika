package revarture.scoops;

public class Scopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scopes defined where our variable exist
		
		if(true) {
			//block scope
			
			
			String x= "inside if block!";
			System.out.println(x);
			
		}
		while ( true) {
			String x= "inside if block!";
			System.out.println(x);
		}

	}

}
