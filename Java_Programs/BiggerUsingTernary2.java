package controlStatement;

import java.util.Scanner;

public class BiggerUsingTernary2 {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");

		a = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		b = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		c = sc.nextInt();

		d = c > (a < b ? b : a) ? c : (a < b ? b : a);
		System.out.println("bigger number  is :" + d);

	}

}
