package practice;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
			
	        System.out.print("Input a decimal number: ");
	        int a = in.nextInt();
	        
	        for (int i=1;i<a; i++) {
	        	if(i%2!=0) {
	        		System.out.println("Odd number are:"+ i);
	        	}
	        }
			

	}

}
