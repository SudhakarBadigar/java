package codeNinjas;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 1;
		while(i<=a) {
			int j =i;
			while(j>0) {
				char c = (char)('A'+j-1);
				System.out.print(c);
				j--;
			}
			System.out.println();
			i++;
		}
	}

}
