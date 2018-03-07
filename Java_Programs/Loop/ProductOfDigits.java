package controlStatement;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		int n, prod = 1, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		n = sc.nextInt();

		while (n > 0) {

			rem = n % 10;
			prod = prod * rem;
			n = n / 10;

		}
		System.out.println(prod);
		sc.close();
	}

}
