package third;

import java.util.Scanner;

public class plus_cycle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int copy = n;
		int count=0;

		while (true) {
			n = ((n%10)*10) + (((n/10) + (n%10))%10);
			count++;
			

			if (n==copy) {
				break;
			}
		}
		System.out.print(count);
	}
}
