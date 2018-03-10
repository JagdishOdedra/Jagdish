// This program will find the bigger of 4 number.
package controlStatement;

import java.util.Scanner;

public class BiggerUsingTernary3 {

	public static void main(String[] args) {
		int a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");

		a = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		b = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		c = sc.nextInt();
		System.out.println("Enter 4th Number:");
		d = sc.nextInt();

		e = (a > b) ? (a > c) ? (a > d) ? a : d : (c > d) ? c : d : (b > c) ? (b > d) ? b : d : (c > d) ? c : d;
		System.out.println("bigger number  is :" + e);
		sc.close();
	}

}
