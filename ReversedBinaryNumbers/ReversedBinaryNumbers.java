import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedBinaryNumbers {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberToReverse = Integer.parseInt(reader.readLine());

        String binaryRepresentationString = Integer.toBinaryString(numberToReverse);

        //gører binaryrepresentationstring (object) mutable dvs. giver os mulighed for at ændre på det
        StringBuilder stringBuilder = new StringBuilder(binaryRepresentationString);

        String reversedBinary = stringBuilder.reverse().toString();

        int numberFromBinary = Integer.parseInt(reversedBinary, 2);

        System.out.println(numberFromBinary);
        
    }
}