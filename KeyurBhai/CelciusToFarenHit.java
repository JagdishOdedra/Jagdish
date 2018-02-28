package programs;



public class CelciusToFarenHit {

	public static void main(String[] args) {

		

		float fahrenhiet;

		for (int celcius = 0; celcius <= 100; celcius += 10) {

			fahrenhiet = ((celcius * 9) / 5) + 32;
			System.out
					.println("Celcious is:" + celcius + "\t" + "Fahrenhiet for the given celcius  is : " + fahrenhiet);

			
		}
	}

}
