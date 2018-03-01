package hackerRank;

public class Patern3 {
	
	public static void main(String [] args) {
		
		int k=0;
		// first loop for row 
		for(int i=1;i<=5;i++) {
			
		// second for column  
			for(int j=0;j<i;j++) {
				System.out.printf("*");
				
			}
			//this will print after the inner loop breaks. 
			System.out.printf("\r\n");
		}
	}

}
