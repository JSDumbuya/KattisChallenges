import java.util.*;

public class ElectricalOutlets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String[] powerstrips = scanner.nextLine().split(" ");
            int k = Integer.parseInt(powerstrips[0]);
            int numnberOfAppliances = 0;
            if (k == 0) {
                System.out.println("1");
                break;
            }
            for (int j = 1; j < k+1; j++) {
                int powerstrip = Integer.parseInt(powerstrips[j]);
                if (j != k) {
                    numnberOfAppliances += powerstrip-1;
                } else {
                    numnberOfAppliances += powerstrip;
                }
            }
            System.out.println(numnberOfAppliances);
        }
        scanner.close();
    }
    
}
