/*
livskvalitet 1 = perfekt helbred.
Livskvalitet 0 = personen er død.
konstant livskvalitet N => livskvalitet*periodens længde.
Hertil skal vi finde den akkumalerede livskvalitet, gennem personens livstid.
*/

import java.util.*;

public class Qaly {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); //Engelsk locale læser decimaltal med punktum.
		
		int n = Integer.parseInt(sc.next());

		double accumulated = 0;


		for (int i = 0; i < n; i++) {
			double qualityOfLife = sc.nextDouble();
			double year = sc.nextDouble();
			accumulated += qualityOfLife*year;
			sc.nextLine();
		}

		System.out.println(accumulated);
		sc.close();
		}
}