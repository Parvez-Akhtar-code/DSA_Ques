package dsa_ques;

import java.util.Scanner;

public class BenjaminBlubs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i*i<=n; i++) {
			System.out.println(i*i);
		}

	}

}
