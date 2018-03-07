package controlStatement;

import java.util.Scanner;

public class DigitsInNumber {
	public static void main(String[] args) {
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		n = sc.nextInt();
		do {
			n = n / 10;
			count++;
		} while (n > 0);
		System.out.println("the digits are : " + count);
		sc.close();
	}

}
