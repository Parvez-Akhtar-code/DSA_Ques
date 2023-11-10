package Functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b1 =sc.nextInt();
		int b2=sc.nextInt();
		int btb=GetBaseValue(n,b1,b2);
		System.out.println(btb);
		
	}
	public static int GetBaseValue(int n, int b1, int b2) {
		int rv=0;
		if(b2==2) {
			int p=1;
			while(n>0) {
				int dig=n%2;
				n=n/2;
				
				rv=rv+dig*p;
				p=p*b1;
			}
			System.out.println(rv);
		}
		if(b2==8) {
			int p=1;
			while(n>0) {
				int dig=n%8;
				n=n/8;
				
				rv=rv+dig*p;
				p=p*b1;
			}
			
		}
		if(b2==10) {
			int p=1;
			while(n>0) {
				int dig=n%10;
				n=n/10;
				
				rv=rv+dig*p;
				p=p*b1;
			}
			
		}
		return rv;

	}

}
