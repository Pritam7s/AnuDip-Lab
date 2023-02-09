package thursday_9_2;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int r, k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row value: ");
		r = sc.nextInt();
	    for (int i = 1; i <= r; ++i, k = 0) {
	      for (int j = 1; j <= r - i; ++j) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	}

}
