package hackerRank;

// program to print maths table from 1-10.

import java.util.Scanner;

public class Patern8 {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);*/

		/*System.out.println("Enter a number :");
		int n = in.nextInt();
*/
		int result,n;
		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= 10; i++) {
				result = j * i;

				System.out.println("" + j + " x " + i + " = " + result);

			
			}
		}
	}
}
