import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class SimpleAddition {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);

       BigInteger firstBigInt = scanner.nextBigInteger();
       BigInteger secondBigInt = scanner.nextBigInteger();

       BigInteger result = firstBigInt.add(secondBigInt);

       System.out.println(result);

        scanner.close();

    }
}