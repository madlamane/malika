package practice;

import java.util.Scanner;

public class Reverse {
	//static String a;
	public static void reverse() {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Enter : ");
         String a = in.next();
         char [] c=a.toCharArray();
         System.out.println("String is :");
         for(int i=c.length-1; i>=0;i-- ) {
        	 System.out.println(c[i]);
         }
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse.reverse();
		
		

	}

}
