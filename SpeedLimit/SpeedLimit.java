//n = et sæt med n linjer.
//s = hastighed - miles pr hour.
//t = total elapsed time.

import java.util.*;

public class SpeedLimit{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
		
			int numberOfLines = Integer.parseInt(sc.next());
			
			if (numberOfLines != -1) {
				int accumulatedMiles = 0;
				int hourPrMile = 0;
				int temporary = 0;
			
				for (int i = 0; i < numberOfLines; i++) {
					int speed = sc.nextInt();
					int elapsedTime = sc.nextInt();
					
					hourPrMile = elapsedTime - temporary;
					temporary = elapsedTime;
					
					//hourPrMile = elapsedTime - hourPrMile;
					
					accumulatedMiles += hourPrMile*speed;
					
					sc.nextLine();
				}
			
				System.out.println(accumulatedMiles + " miles");
				
			}
		}
			sc.close();
	}
}