package third;

import java.util.Scanner;

public class star_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i, j, k;

		for (i = 1; i <= t; i++) {
			for (j = 1; j <= t - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}