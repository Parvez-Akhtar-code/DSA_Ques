package Patterns;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int s=n*i;
			System.out.println(n+"*"+i+"="+s);
		}
		System.out.println();

	}

}
