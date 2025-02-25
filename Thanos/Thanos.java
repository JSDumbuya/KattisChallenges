import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int planets = sc.nextInt();

        for (int i = 0; i < planets; i++) {
            int population = sc.nextInt();
            int growthRate = sc.nextInt();
            int foodSupply = sc.nextInt();
            long growingPopulation = population;
            int yearsToLive = 0;

            if (growingPopulation > foodSupply) {
                System.out.println(0);
            } else {
                while (growingPopulation <= foodSupply) {
                    yearsToLive ++;
                    growingPopulation *= growthRate;
                }
                System.out.println(yearsToLive);
            }
        }
        
        sc.close();
    }
}
