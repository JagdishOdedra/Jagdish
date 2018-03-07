package controlStatement;

import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter year: ");

		year = sc.nextInt();

		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "it's a leap year");
		} else {
			System.out.println(year + "it's a leap year");

		}

		sc.close();
	}

}
