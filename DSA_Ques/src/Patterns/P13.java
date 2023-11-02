package Patterns;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int i,j;
		int a=0;
		int b=1;
		int c;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}

	}

}
