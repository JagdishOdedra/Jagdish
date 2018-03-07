package controlStatement;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, n, rem, sum, cube;
		System.out.println("Armstrong Numbers are:");
		for (num = 1; num <= 10000; num++) {
			n = num;
			sum = 0;
			while (n > 0) {

				rem = n % 10;
				n = n / 10;
				cube = rem * rem * rem;
				sum = sum + cube;
			}

			if (num == sum) {
				System.out.println(num);

			}

		}

	}

}
