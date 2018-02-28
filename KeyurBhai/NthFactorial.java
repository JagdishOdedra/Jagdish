package programs;

import java.util.Scanner;

public class NthFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Factorial: ");
		int givenNum = sc.nextInt();

		if (givenNum > 0) {
			int n = 1;

			for (int i = givenNum; i >= 1; i--) {
				n = n * i;
			}
			System.out.println("Factorial of entered number is : " + n);
		} else {
			System.out.println("Factorial is not possible for given input");
		}
	}

}
