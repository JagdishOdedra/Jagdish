package hackerRank;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		int decNum;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter any decimal number: ");

		decNum = sc.nextInt();
		System.out.println(Integer.SIZE);
		for (int i = ((Integer.SIZE) ) - 1; i >= 0; i--) {

			System.out.printf("" + ((decNum >> i) & 1));
			
		}
		
	}

}
