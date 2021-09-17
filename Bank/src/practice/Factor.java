package practice;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
			
	        System.out.println("Input a  number: ");
	        int a = in.nextInt();
	        int c=0;
	        for(int i=1; i<=a;i++) {
	        	if(a%i ==0) {
	        		c++;
	        		//System.out.println(i);
	        		
	        	}
	        	
	        }
	        System.out.println(c);

	}

}
