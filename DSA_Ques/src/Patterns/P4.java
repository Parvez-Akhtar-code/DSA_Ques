package Patterns;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i ,j ;
		for(i=n;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
				System.out.print("\t");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
