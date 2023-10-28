package dsa_ques;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int temp=n;
		int nod=0;
		while(temp>0) {
			temp=temp/10;
			nod++;
		}
		int div=1;
		int multi=1;
		
		for(int i=1;i<=nod;i++) {
			if(i<=r) {
				div=div*10;
			}
			else {
				multi=multi*10;
			}
			}
		int q=n/div;
		int rm=n%div;
		
		int rn=rm*multi+q;

		System.out.println(rn);
	}

}
