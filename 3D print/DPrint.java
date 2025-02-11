import java.util.*;

public class DPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = scanner.nextInt();

        //variable to return
        int dayCount = 0;
        int totalStatuesprinted = 0;
        int totalPrinters = 1; 


        
        while(totalStatuesprinted < goal) {
            if(goal - totalStatuesprinted > totalPrinters) {
                totalPrinters *= 2;
            } else {
                totalStatuesprinted += totalPrinters;
            }
            dayCount++;
        }

        System.out.print(dayCount);

    }

}