import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt('\n');
        int[] recitedNumbers = new int[N];
        int recitedNumber = 0;

        for (int i = 0; i < N; i++) {
            recitedNumber = scanner.nextInt('\n');
            recitedNumbers[i] = recitedNumber;
        }

        boolean isGoodJob = true;
        int biggestNumber = recitedNumbers[recitedNumbers.length-1];
        int[] missingNumbers = new int[biggestNumber];

        int index = 0;
        int anotherIndex = 1;

        for (int i = 0; i < missingNumbers.length; i++) {
                if (recitedNumbers[index] == anotherIndex) {
                    missingNumbers[i] = recitedNumbers[index];
                    index++;
                } else {
                    isGoodJob = false;
                }

            anotherIndex++;
        }

        if (isGoodJob) {
            System.out.println("good job");
        } else {
            for (int i = 0; i < missingNumbers.length; i++) {
                if (missingNumbers[i] == 0) {
                    int missingNumber = i+1;
                    System.out.println(missingNumber);
                }
            }
        }

        scanner.close();
    }
}