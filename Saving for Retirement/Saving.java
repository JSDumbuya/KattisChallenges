import java.util.*;

public class Saving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bobAge = sc.nextInt();
        int bobRetirementAge = sc.nextInt();
        int bobSavingsAnnual = sc.nextInt();
        int aliceAge = sc.nextInt();
        int aliceSavingsAnnual = sc.nextInt();
       

        int bobRetirementSavings = (bobRetirementAge - bobAge) * bobSavingsAnnual;
        
        int yearsUntilPensionAlice = (int) Math.ceil((double) (bobRetirementSavings + 1) / aliceSavingsAnnual);
        int aliceRetirementAge = yearsUntilPensionAlice + aliceAge;

        System.out.println(aliceRetirementAge);

        sc.close();
    }
}