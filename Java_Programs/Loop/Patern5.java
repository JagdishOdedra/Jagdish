package hackerRank;
/******
****
***
**
*
*/public class Patern5 {

	public static void main(String[] args) {

		int k = 0;
		// first loop for row
		for (int i = 5; i >= 1; i--) {

			// second for column
			for (int j = 0; j < i; j++) {
				System.out.printf("*");

			}
			System.out.printf("\r\n");
		}
	}
}
