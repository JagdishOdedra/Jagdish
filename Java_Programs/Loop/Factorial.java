package controlStatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();

		if (n < 0) {
			System.out.println("No factorial for a negetive number");
		} else {
			while (n > 1) {

				fact *= n;

				n--;

			}
			System.out.println("factorial is :" + fact);

		}
		sc.close();
	}
}
