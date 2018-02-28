package programs;

public class SwapNumbers {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 6;
		int temp;
		System.out.println("Before swap value of a : " + num1);
		System.out.println("Before swap value of b : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swap value of a :" + num1);
		System.out.println("After swap value of b :" + num2);

	}

}
