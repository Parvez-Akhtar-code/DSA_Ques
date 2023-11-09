package Functions;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int dn=GetValueInBase(n, b);
		System.out.println(dn);
	}	
		public static int GetValueInBase(int n,int b) {
			int rev=0;
			int p=1;
			while(n!=0) {
				
				int dig=n%b;
				n=n/b;
				
				rev=rev+dig*p;
				p=p*10;
			}
			
			
			return rev;
		

	}

}
