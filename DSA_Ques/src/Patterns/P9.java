package Patterns;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i+j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
