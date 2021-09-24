package practice;

import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int   b;
		String j="";
		char x []= {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please :");
		int a =sc.nextInt();
		
		while(a >0)
		{
			b= a%16;
			j=x[b]+j;
			a=a/16;
			
		}
		
        System.out.print("number is :"+ j);
		
		

	}

}
