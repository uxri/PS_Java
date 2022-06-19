package third;

import java.util.Scanner;

public class A_plus_b_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a==0 && b==0) {
			break;
		}
		System.out.println((a + b));
		}
	}
}