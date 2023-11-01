package Patterns;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int i,j;
		int sp=0;
		int st=1;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*\t");
			}
			
			for(j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			sp++;
			
		}
		System.out.println();
		

	}

}
