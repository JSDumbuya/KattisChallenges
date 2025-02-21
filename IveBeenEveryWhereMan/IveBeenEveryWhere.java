import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IveBeenEveryWhere {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfTestCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfTestCases; i++) {
            Set<String> listOfCities = new HashSet<>();
            int numberOfTrips = Integer.parseInt(reader.readLine());

            for (int j = 0; j < numberOfTrips; j++) {
                String inputLine = reader.readLine();
                listOfCities.add(inputLine);
            }

            System.out.println(listOfCities.size());
        }
    }
}