import java.util.Scanner;

public class FiftyShadesOfPink {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = scanner.nextInt();

        scanner.nextLine();

        String[] input = new String[n];

        int numberOfTrainingDays = 0;

        boolean canTrain = false;

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i].toLowerCase().contains("pink") || input[i].toLowerCase().contains("rose")) {
                 numberOfTrainingDays++;
                 canTrain = true;
            }
        }

        if (canTrain) {
            System.out.println(numberOfTrainingDays);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
    
}
