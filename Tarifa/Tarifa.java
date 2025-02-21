import java.util.*;

public class Tarifa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.nextLine();
        int N = scanner.nextInt();
        scanner.nextLine();
        int nextMonthMegaBytes = 0; 

        for (int i = 0; i < N; i++) {
            int thisMonthsUse = scanner.nextInt();
            scanner.nextLine();   

            if (thisMonthsUse <= X) {
                nextMonthMegaBytes += X - thisMonthsUse;
            } else {
                 nextMonthMegaBytes -= thisMonthsUse - X;
            }

        }

        nextMonthMegaBytes += X;

        System.out.println(nextMonthMegaBytes);


        scanner.close();
    }
}
