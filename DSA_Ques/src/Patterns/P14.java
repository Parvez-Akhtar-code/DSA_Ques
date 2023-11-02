package Patterns;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		
		
		for(i=0;i<n;i++) {
			int icj=1;
			for(j=0;j<=i;j++) {
				System.out.print(icj+" ");
				int icjpi = icj*(i-j)/(j+1);
				icj=icjpi;
			}
			System.out.println();
		}

	}

}
