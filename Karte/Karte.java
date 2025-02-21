import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Karte {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumP = 13;
        int sumK = 13;
        int sumH = 13;
        int sumT = 13;

        int sumInstancesP = 0;
        int sumInstancesK = 0;
        int sumInstancesH = 0;
        int sumInstancesT = 0;

        String input = reader.readLine();
        int beginIndex = 0;
        int endIndex = 3;
        boolean isDouble = false;

        Set<Integer> setOfKartesH = new HashSet<Integer>();
        Set<Integer> setOfKartesK = new HashSet<Integer>();
        Set<Integer> setOfKartesT = new HashSet<Integer>();
        Set<Integer> setOfKartesP = new HashSet<Integer>();
        int karteNumber = 0;

        for (int i = 0; i < input.length(); i+=3) {
            String substring = input.substring(beginIndex, endIndex);
            
            String[] splitKarte = substring.split("[A-Z]");
            if (splitKarte[1].startsWith("0")) {
                String temp = splitKarte[1].replaceFirst("0", "");
                karteNumber = Integer.parseInt(temp);
            } else {
                karteNumber = Integer.parseInt(splitKarte[1]);
            }
          

            if (substring.startsWith("P")) {
                setOfKartesP.add(karteNumber);
                sumInstancesP++;
                if (sumP > 0) { 
                    sumP--; 
                }
            } else if (substring.startsWith("K")) {
                setOfKartesK.add(karteNumber);
                sumInstancesK++;
                if (sumK > 0) {
                     sumK--;
                }
            } else if (substring.startsWith("H")) {
                sumInstancesH++;
                setOfKartesH.add(karteNumber);
                if (sumH > 0) {
                    sumH--;
                }
            } else {
                setOfKartesT.add(karteNumber);
                sumInstancesT++;
                if (sumT > 0) {
                    sumT--;
                }
            }

            if (beginIndex < input.length()-2 && endIndex < input.length()) {
                beginIndex += 3;
                endIndex += 3;
            }
        }

        if (setOfKartesH.size() < sumInstancesH || setOfKartesK.size() < sumInstancesK || setOfKartesP.size() < sumInstancesP || setOfKartesT.size() < sumInstancesT  ) {
            isDouble = true;
        }


        if (isDouble) {
            System.out.println("GRESKA");
        } else {
            System.out.println(sumP + " " + sumK + " " + sumH + " " + sumT);
        }
        
        reader.close();

    }
}