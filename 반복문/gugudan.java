package third;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;

		for (i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}