//Compute the difference of non-negative integers.
//Print absolut værdi.

import java.util.*;

public class Different{
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		long result = 0;
		
		//Brug long da int ikke er stor nok til at opbevare værdien.
		
		while (sc.hasNextLong()) {
			long firstValue = sc.nextLong();
			long secondValue = sc.nextLong();
			
			result = Math.abs(firstValue - secondValue);
			
			System.out.println(result);
			
			sc.nextLine();
		}
		
		sc.close();
	}
}