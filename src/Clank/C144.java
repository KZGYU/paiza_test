package Clank;

import java.util.Scanner;

public class C144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numberWin = 0;

		for (int i = 0; i < n; i++) {
			String A = sc.next();
			String B = sc.next();
			
			if(A.equals("G") && B.equals("C")) {
				numberWin++;
				
			}
			
			if(A.equals("C") && B.equals("P")) {
				numberWin++;
				
			}
			
			if(A.equals("P") && B.equals("G")) {
				numberWin++;
				
			}

		}
		
		System.out.println(numberWin);
	}

}
