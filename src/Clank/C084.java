package Clank;

import java.util.Scanner;

public class C084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=-1; i<=str.length(); i++) {
			System.out.print("+");
		}
		
		System.out.println();
		System.out.println("+" + str + "+");
		
		for(int i=-1; i<=str.length(); i++) {
			System.out.print("+");
		}
		
		
		
		
	}

}
