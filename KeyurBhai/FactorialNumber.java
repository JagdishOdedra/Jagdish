package programs;

public class FactorialNumber {

	public static void main(String[] args) {

		int n = 1;
		
		for (int i = 3; i >= 1; i--) {
             n = n * i;
		}
		System.out.println("Factorial of 3 is : "+n);
	}

}
