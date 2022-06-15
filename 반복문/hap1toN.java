package third;

import java.util.Scanner;

public class hap1toN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int sum =0;
		
		for (i=0; i<=n; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
