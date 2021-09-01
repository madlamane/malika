package practice;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j;
		int x []=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please :");
		int a =sc.nextInt();
		
		while(a !=0)
		{
			x[i++]= a%2;
			a=a/2;
			
		}
		System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(x[j]);
        }
        //System.out.print("\n");
		
		

	}

}
