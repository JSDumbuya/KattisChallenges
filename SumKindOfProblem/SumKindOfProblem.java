import java.util.*;

public class SumKindOfProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < p; i++) {
            int dataSetNumber = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();

            int sumPositive = 0;
            int sumOdd = 0;
            int sumEven = 0;
            int indexPositive = 1;
            int indexOdd = 1;
            int indexEven = 2;

            for (int j = 1; j < n+1; j++) {
                sumPositive += indexPositive;
                indexPositive++;

                sumOdd += indexOdd;
                indexOdd += 2;

                sumEven += indexEven;
                indexEven += 2;
                
            }

            System.out.println(dataSetNumber + " " + sumPositive + " " + sumOdd + " " + sumEven);
        }

        scanner.close();
    }
}