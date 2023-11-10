package Functions;

import java.util.Scanner;

public class BaseMultipication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gm=value(b, n1, n2);
		System.out.println(gm);
	}
	public static int value(int b , int n1 , int n2) {
		int rv=0;
		int p=1;
		while(n2>0) {
			int d2=n2%10;
			n2=n2/10;
			int sp=GetMulti(b, n1, d2);
			rv=GetAdd(b, rv, sp*p);
			p=p*10;
			}
			return rv;
	}
	
	
	public static int GetMulti(int b, int n1, int d2) {
		int rv=0;
		int c=0;
		int p=1;
		while(n1>0||c>0) {
			int d1=n1%10;
			n1=n1/10;
			
			int d = d1*d2+c;
			c=d/b;
			d=d%b;
			
			rv=rv+d*p;
			p=p*10;
			
			
		}
		return rv;
	}
	public static int GetAdd(int b , int n1,int n2) {
		int rv=0;
		int p=1;
		int c=0;
		while(n1>0 || n2>0 || c>0 ) {
		int d1=n1%10;
		int d2=n2%10;
		
		n1=n1/10;
		n2=n2/10;
		
		int d=d1+d2+c;
		c=d/b;
		d=d%b;
		
		rv=rv+d*p;
		p=p*10;
		}
		
		
		return rv;
	}


}
