import java.util.*;

public class Opening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bottles = sc.nextInt();
        sc.nextLine();
        int desiredBottles = sc.nextInt();
        int index = 1;

        if (desiredBottles >= bottles || bottles < 2) {
            System.out.println("impossible");
        } else {
            for (int i = 0; i < desiredBottles; i++) {
                int openWith = index + 1;
                System.out.println("open " + index + " using " + openWith);
                index++;
            }
        }

        sc.close();
    }
}