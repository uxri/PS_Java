package fourth;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float[] arr = new float[t];
		int i;
		float max = 0;
		float avg = 0;

		for (i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int k = 0; k < arr.length; k++) {
			avg += ((arr[k] / max) * 100)/t;
		}
		System.out.print(avg);
	}
}
