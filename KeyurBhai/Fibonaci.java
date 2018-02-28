package programs;

public class Fibonaci {

	public static void main(String[] args) {

		int oldVar = 0;
		int curVar = 1;
		int newVar;
		for (int index = 0; index <= 10; index++) {
			if (index == 0) {
				System.out.println("Fibonaci series: ");
				System.out.println(curVar);
			} else {
				newVar = oldVar + curVar;
				oldVar = curVar;
				curVar = newVar;
				System.out.println(newVar);
			}

		}
	}

}
