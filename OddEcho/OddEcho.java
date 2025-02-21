import java.util.*;

public class OddEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }

        int index = 0;

        for (int i = 1; i < input.length+1; i++) {
            if (i % 2 != 0) {
                System.out.println(input[index]);
            } 
            index++;
        }
        scanner.close();
    }
}