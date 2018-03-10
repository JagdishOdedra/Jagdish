package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int n, i, x = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = in.nextInt();

		for (i = 1; i <= n; i++) {

			if (n % i == 0)
				x++;

		}
// number is divisible by itself and 1. so value should be two that's y x==2. 
		if (x == 2)
			System.out.println("It's prime number");

		else
			System.out.println("It's not a prime number:");
		in.close();
	}

}
