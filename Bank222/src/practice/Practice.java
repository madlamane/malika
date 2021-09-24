package practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number please: ");
		int x= sc.nextInt();
		
		
		int a[]= new int[100];
		
		while(x!=0) {
			a[i++]=x%2;
			x= x/2;
			
			
		}
		for(int j=i-1;j>0; j--) {
			System.out.println(a[j]);
		}
		System.out.println();//new line  
	}    

	

}
