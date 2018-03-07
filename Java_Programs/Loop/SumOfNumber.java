package controlStatement;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please enter the number(enter 0 to stop):");
			n = sc.nextInt();
			sum = sum + n;

		} while (n != 0);
		System.out.println("sum is:" + sum);
		sc.close();
	}

}
