package Clank;

import java.util.Scanner;

public class C155 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.nextLine();

		int n = sc.nextInt();
		sc.nextLine();

		String[] mailStr = new String[n];

		for (int i = 0; i < n; i++) {
			mailStr[i] = sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
			if (mailStr[i].contains(str)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		sc.close();
	}
}
