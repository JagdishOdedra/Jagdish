package hackerRank;

import java.util.Scanner;

public class Patern2 {
	

	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        //System.out.println("Enter value of t: ");
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            for (int j = 0; j < n; j++) 
	            { 
	                a += b; 
	                System.out.print(a + " "); 
	                b *= 2; 
	            } 
	            System.out.println();
	        }
	        in.close();
	    }
	}

