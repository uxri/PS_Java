package third;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			int i, j;

			for (i = 1; i <= t; i++) {
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}