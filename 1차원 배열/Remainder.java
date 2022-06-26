package fourth;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int i;
		int a;
		int count=0;

		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		for (i = 0; i < 10; i++ ) {
		      a = 0;
		      for ( int k = i+1; k < 10; k++ ) {
		        if ( arr[i] == arr[k] ) {
		          a ++;
		        }
		      }
		      if ( a == 0 ) {
		        count ++;
		      }
		    }
		System.out.print(count);
	}
}
