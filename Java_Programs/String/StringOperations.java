package string;

public class StringOperations {

	public static void main(String[] args) {

		// String s = "Jagdish Odedra!";

		String s = new String("Jagdish Odedra! ");

		// to return number of character in string

		System.out.println("No of character in string are:" + s.length());

		// character at index

		System.out.println("character at index:" + s.charAt(3));

		// substring

		System.out.println("substring:" + s.substring(8));

		// substring

		System.out.println("substring from to : " + s.substring(2, 14));

		// Concatenates of two stirng
		String s1 = "Jagdish";
		String s2 = "Hello Odedra";
		System.out.println("Concatenates:" + s1.concat(s2));

		// index within the string

		String s3 = "Hello Jagdish Odedra! ";

		System.out.println("Index within a string :" + s3.indexOf("Jagdish"));
		// starting at the specified index.

		System.out.println("starting at the specified index." + s3.indexOf('a', 3));

		Boolean out = "jagdish".equals("JAGDISH");
		System.out.println("Checking equality:" + out);

		Boolean out1 = "jagdish".equalsIgnoreCase("JAGDISH");
		System.out.println("Checking equality:" + out1);

		int out2 = s1.compareTo(s2);
		System.out.println("" + out2);

		String word1 = "  Hi There Jagdish   ";

		System.out.println("Lowercase" + word1.toLowerCase());

		System.out.println("Upercase" + word1.toUpperCase());
		System.out.println("leave spaces = before and after: " + word1.trim());

		String str = "KouseHover Kovekent";

		System.out.println("Replace character in string :" + str.replace('K', 'M'));

	}

}
