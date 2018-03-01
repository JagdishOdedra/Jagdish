package programs;

public class SwappingNumbersUsingTwoVariables {

	public static void main(String[] args) {
        int num1 = 15;
		int num2 = 5;
		System.out.println("Before swap value of num1 : " + num1);
		System.out.println("Before swap value of num2 : " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
        num1 = num1 - num2;

		System.out.println("After swap value of num1 : " + num1);
		System.out.println("After swap value of num2 : " + num2);

	}
}
