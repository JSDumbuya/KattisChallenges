import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reverse {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amountOfCases = Integer.parseInt(reader.readLine());

        int[] input = new int[amountOfCases];

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(reader.readLine());
        }

        int indexDescending = input.length-1;

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[indexDescending]);
            if (indexDescending > 0) {
                indexDescending--;
            }
        }

        reader.close();
    }
}