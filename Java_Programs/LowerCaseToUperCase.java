package controlStatement;

// program to convert character -lowercase to upercase
import java.io.IOException;
import java.util.Scanner;

public class LowerCaseToUperCase {

	public static void main(String[] args) throws IOException {
		int uperCase;
		System.out.println("Enter a character in lowercase:");
		char lowercase = (char) System.in.read();
		uperCase = (int) lowercase - 32;

		System.out.printf("%c", uperCase);
	}

}
