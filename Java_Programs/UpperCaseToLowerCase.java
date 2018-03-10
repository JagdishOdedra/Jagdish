package controlStatement;

import java.io.IOException;
import java.util.Scanner;

public class UpperCaseToLowerCase {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int lowercase;
		System.out.println("Enter a  character in Upercase:");
		char uperCase = (char) System.in.read();
		// System.out.println(c);
		lowercase = (int) uperCase + 32;
		// c = (char) a;
		System.out.printf("%c", lowercase);
	}

}
