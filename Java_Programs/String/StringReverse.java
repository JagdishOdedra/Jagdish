package string;

import java.util.Scanner;

public class StringReverse {

	public static int stringLength(String s) {
		/*
		 * for (i = 0; s.charAt(i) != '\0'; i++) { System.out.println("index" + i +
		 * "character" + s.charAt(i)); }
		 */
		return s.length();

	}

	public static char[] StrReverse(String s, int len) {
		char[] temp = new char[26];
		int j = len;
		int i = 0;

		for (; i < len;) {
			temp[j--] = s.charAt(i);
			i++;
		}
		System.out.println(temp);
		return temp;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println(input);
		int len = stringLength(input);
		System.out.println("Length of string :" + len);
		StrReverse(input, len);
		sc.close();
	}

}
