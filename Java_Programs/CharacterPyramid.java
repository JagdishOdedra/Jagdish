package programs;

public class CharacterPyramid {

	public static void main(String[] args) {
		int k = 97;
		for (int i = 97; i <= 103; i++) {

			for (int j = 97; j <= i; j++) {
				if (k <= 122) {

					System.out.printf("  %c  ", k++);
				}
			}
			System.out.printf("\n");
		}

	}

}
