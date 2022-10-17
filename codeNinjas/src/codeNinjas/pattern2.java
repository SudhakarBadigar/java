package codeNinjas;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		
		int i=1;
		while(i<=k)
		{
			int j=1;
			while(j <=i)
			{
				char m = (char) ('A'+i-1);
				System.out.print(m);
				j++;
			}
			System.out.println();
			i++;
		}
			}

}
