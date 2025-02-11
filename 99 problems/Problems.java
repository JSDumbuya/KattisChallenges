import java.util.*;

public class Problems{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        if (N <= 100) {
            System.out.println(99);
        } else {
            int upper = (N/100) * 100 + 99;
            int lower = upper - 100;

            int distanceLower = Math.abs(N-lower);
            int distanceUpper = Math.abs(N-upper);

            if (distanceLower < distanceUpper) {
                System.out.println(lower);
            } else if (distanceUpper < distanceLower) {
                System.out.println(upper);
            } else if (distanceLower == distanceUpper) {
                if (lower > upper) {
                    System.out.println(lower);
                } else {
                    System.out.println(upper);
                }
            }
        }

    }

}