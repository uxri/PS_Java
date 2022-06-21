package fourth;

import java.util.Arrays;
import java.util.Scanner;

public class Min_max {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		int i;

		for (i = 0; i <= t-1; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[t-1]);
	}
}
