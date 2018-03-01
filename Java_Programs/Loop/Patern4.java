package hackerRank;

public class Patern4 {

	public static void main(String[] args) {

		int k = 0;
		// first loop for row
		for (int i = 1; i <= 5; i++) {

			// second for column
			for (int j = 0; j < i; j++) {
				System.out.printf(" "+k++);

			}
			System.out.printf("\r\n");
		}
	}

}
