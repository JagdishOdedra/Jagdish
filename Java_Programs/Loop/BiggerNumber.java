package controlStatement;

import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		int a, b, c, big;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		

		if (a > b) {

			if (a > c) {

				big = a;

			} else {
				big = c;
			}
		} else {
			if (b > c) {
				big = b;

			} else {
				big = c;
			}

		}
		System.out.println("biggest Number is : " + big);
		sc.close();
	}
}
