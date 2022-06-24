package fourth;

import java.util.Scanner;

public class Find_max {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int i;
		int max = 0;
		int index = 0;
		
		for (i = 0; i < 9; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}

		for (i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
