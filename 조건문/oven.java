package second;

import java.util.Scanner;

public class oven {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H, M, T;
		H = sc.nextInt();
		M = sc.nextInt();
		T = sc.nextInt();

		int a = H*60 + M + T;
		H = a/60;
		M = a%60;
		
		if (H>=24) {
			H -= 24;
		}
		
		System.out.println(H + " "+ M);
	}
}
