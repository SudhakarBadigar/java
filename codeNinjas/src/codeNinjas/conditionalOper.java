package codeNinjas;

import java.util.Scanner;

public class conditionalOper {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		
		
		if(k % 2 == 0) 
		{
			System.out.println(k + " :is even " );
		}
		else {
			System.out.println(k +"  :odd :" );
		}
	}
}
