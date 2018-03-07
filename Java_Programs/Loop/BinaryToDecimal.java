package controlStatement;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int n, rem, d, j = 1, dec = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in binary: ");

		n = sc.nextInt();

		while (n > 0) {

			rem = n % 10; // to take last digit of n
			d = rem * j;
			dec = dec + d;
			j = j * 2;
			n = n / 10; // to skip last digit
		}
		System.out.printf("Decimal for the given binary is :" + dec);

		sc.close();
	}

}
