package Functions;

import java.util.Scanner;

public class main {

	public static void display(int n , int r ,int npr){
		System.out.println(n+"P"+r+"="+npr);
	}
	
	public static int fact(int x) {
		int rev=1;
		for(int i=1; i<=x;i++) {
			rev=rev*i;
		}
		x=rev;
		return x ;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
				
		int nfact=fact(n);
		int nmrfact = fact(n-r);
		
		int npr = nfact/nmrfact;
		display(n,r,npr);

	}

}
