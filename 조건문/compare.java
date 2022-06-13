package second;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (a < b)
			System.out.println("<");
		else if (a > b)
			System.out.println(">");
		else
			System.out.println("=");
	}
}
