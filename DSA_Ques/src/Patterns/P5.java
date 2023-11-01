package Patterns;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int i,j;
		int st=1;
		int sp=n/2;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(j=1;j<=st;j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				st+=2;
				sp--;
			}
			else {
				st-=2;
				sp++;
			}
			System.out.println();
		}

	}

}
