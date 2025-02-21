import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int[] perfectSet = new int[] {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < input.length; i++) {
            int alreadyOwnedPawns = Integer.parseInt(input[i]);

            if (alreadyOwnedPawns == perfectSet[i]) System.out.print(0 + " ");
            else if (alreadyOwnedPawns > perfectSet[i]) System.out.print(perfectSet[i] - alreadyOwnedPawns + " ");
            else System.out.print(perfectSet[i] - alreadyOwnedPawns + " ");
        }

        sc.close();
    }
    
}
