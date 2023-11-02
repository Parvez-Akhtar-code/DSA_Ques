package Patterns;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int i,j;
		int sp=2;
		int st=1;
		int val=1;
		
		for(i=1;i<=n;i++) {
			int cval=val;
			for(j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			for(j=1;j<=st;j++) {
				System.out.print(cval+"\t");
				
				if(j<=st/2) {
			    cval++;
				}
				else {
					cval--;
				}
				
			}
			if(i<=n/2) {
			sp--;
			st+=2;
			val++;
			}
			else {
				sp++;
				st-=2;
				val--;
			}
			System.out.println();
		}
		

	}

}
