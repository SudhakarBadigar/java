package codeNinjas;

import java.util.Scanner;

public class check2Nos {

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println("first num  is greater");
		}
		else if(a<b) {
			System.out.println("second num is greater");
		}
		else {
			System.out.println("both are equal");
		}
	}
}
