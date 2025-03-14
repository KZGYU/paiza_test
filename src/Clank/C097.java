package Clank;

import java.util.Scanner;

public class C097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			String successful;
			
			int tousenX = i % x;
			int tousenY = i % y;
			
			if(tousenX==0 && tousenY==0 ) {
				successful = "AB";
				
			}else if(tousenX==0) {
				successful = "A";
				
			}else if(tousenY==0) {
				successful = "B";
			}else {
				successful = "N";
			}
			
			System.out.println(successful);
			
		}
		
		
	}

}
