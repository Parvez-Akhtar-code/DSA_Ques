package Patterns;

import java.util.Scanner;

public class P17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int sp=(2*n)-3;
		int st=1;
		
		for(i=1;i<=n;i++) {
			int val=1;
			for(j=1;j<=st;j++) {
				System.out.print(val+"\t");
				val++;
			}
			for(j=1;j<=sp;j++) {
				System.out.print("\t");
				
			}
			if(i==n) {
				st--;
			}
			for(j=1;j<=st;j++) {
				val--;
				System.out.print(val+"\t");
				
			}
			st++;
			sp-=2;
			System.out.println();
		}
	}

}
