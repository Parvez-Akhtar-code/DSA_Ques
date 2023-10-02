package dsa_ques;

import java.util.*;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your name : ");
		String st=sc.nextLine();
		System.out.print("enter your number : ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("name : "+st);	
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		

	}

}
