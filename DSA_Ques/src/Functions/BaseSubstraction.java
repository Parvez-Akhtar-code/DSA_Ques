package Functions;

import java.util.Scanner;

public class BaseSubstraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gs=GetSub(b, n1, n2);
		System.out.println(gs);
	}
	public static int GetSub(int b, int n1, int n2) {
		int rv=0;
		int p=1;
		int c=0;
		while(n1>0){
			int d1=n1%10;
			n1=n1/10;
			int d2=n2%10;
			n2=n2/10;
			
			int d= 0;
			d1=d1+c;
			
			if(d1>=d2) {
				c=0;
				d=d1-d2;
			}else {
				c=-1;
				d=d1+b-d2;
			}
			
			rv=rv+d*p;
			p=p*10;
			}
		return rv;
	}

}
