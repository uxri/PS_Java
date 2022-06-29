package fourth;

import java.util.Scanner;

public class OX {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String ox =null;

		for (int i = 0; i < t; i++) {
			String a = sc.nextLine();
			int count = 0;
			int score = 0;
			ox=sc.next();
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j)=='O') {
					count++;
					score += count;
				} else if (ox.charAt(j)=='X') {
					count = 0;
				}
			}
			System.out.println(score);
		}
	}
}
