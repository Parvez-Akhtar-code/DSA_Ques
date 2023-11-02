package Patterns;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int osp=0;
		int st=n;
		int isp=0;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=osp;j++) {
				System.out.print("\t");
			}
			for(j=1;j<=st;j++) {
				if(i>1 && i<=n/2  && j>1 && j<st) {
					System.out.print("\t");
				}else {
				System.out.print("*\t");
				}
				}
			if(i<=n/2) {
			osp++;
			st-=2;
			}
			else {
				osp--;
				st+=2;
			}
			System.out.println();
		}

	}

}
