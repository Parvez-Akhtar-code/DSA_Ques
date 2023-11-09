package dsa_ques;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int d=GetValueInDecimal(n,b);
		System.out.println(d);

	}
	public static int GetValueInDecimal(int n,int b) {
		int rv=0;
		int p=1;
		while(n>0) {
			int dig=n%10;
			n=n/10;
			
			rv=rv+dig*p;
			p=p*b;
		}
		
		
		return rv;
		
	}

}
