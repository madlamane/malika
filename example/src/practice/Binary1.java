package practice;

import java.util.Scanner;

public class Binary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number :");
		int a =sc.nextInt();
		int i;
		int x=0;
		/*int x=0;
		
		int b [] = new int [100];
		
		while(a!=0) {
			b[ x++]= a%8;
			a/=8;*/
		
			
			
		for(i=0; i<=a;i++) {
			x+=i;
			
			
			
		}
		
		System.out.println("The  number is :"+ x);
		
		
		

	}

}
