package third;

import java.util.Scanner;

public class smaller_than_X {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i;
		
		for(i=0; i<a; i++) {
			int c = sc.nextInt();
			if(c<b) {
				System.out.print(c + " ");
			}
		}

		
	}
}