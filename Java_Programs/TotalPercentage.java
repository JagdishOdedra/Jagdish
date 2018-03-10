package programs;

import java.util.Scanner;

public class TotalPercentage {
	public static void main(String[] args) {
		int maths, physics, chemistry, english, biology, sum, total = 500;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Math's marks:");
		maths = sc.nextInt();
		
		System.out.println("Enter Physic's marks:");
		physics = sc.nextInt();
		
		System.out.println("Enter Chemistry's Marks:");
		chemistry = sc.nextInt();
		
		System.out.println("Enter English's  marks:");
        english = sc.nextInt();
        
		System.out.println("Enter Biology's Marks:");
		biology = sc.nextInt();

		sum = (maths + physics + chemistry + biology + english);
		System.out.println("Sum of 5 subject's are : " + sum);

		per = (sum * 100) / total;
		System.out.println("Percentage are:" + per);
		sc.close();
	}

}
