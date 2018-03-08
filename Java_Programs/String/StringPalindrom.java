package string;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {

		String s, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		s = sc.nextLine();
		// to find the length of string

		int length = s.length();
		System.out.println("Length of given string :" + length);

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		if (s.equals(rev)) {
			System.out.println("The Entered string is palindrome");
		} else
			System.out.println("The string is not palindrom");
	}
}
