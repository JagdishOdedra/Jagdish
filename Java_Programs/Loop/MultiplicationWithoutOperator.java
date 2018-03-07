package controlStatement;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) {
		int a, b, i, result = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter second number :");
		b = sc.nextInt();

		for (i = 1; i <= b; i++) {

			result = result + a;
		}

		System.out.println("Result is :" + result);
	}

}
