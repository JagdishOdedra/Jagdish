package controlStatement;

import java.io.IOException;

public class CharAnyCaseConversion {

	public static void main(String[] args) throws IOException {
		int c1 = 0;
		System.out.print("Enter a character: ");

		char ch = (char) System.in.read();

		if (ch >= 65 && ch <= 90) {
			c1 = (int) ch + 32;

			System.out.printf("Lower case character is:%c", c1);
		} else if (ch >= 97 && ch < 122) {
			{
				c1 = (int) ch - 32;
			}
			System.out.printf("Upercase Char is: %c", c1);
		}

	}

}
