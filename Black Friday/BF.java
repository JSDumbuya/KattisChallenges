import java.util.*;

public class BF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupSize = sc.nextInt();
        sc.nextLine();
        String[] temp = sc.nextLine().split(" ");
        int[] outcomes = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int outcome : outcomes) {
            if (frequencyMap.get(outcome) != null) {
            frequencyMap.put(outcome, frequencyMap.get(outcome) + 1);
            } else {
                frequencyMap.put(outcome, 1);
            }
        }
        
        int maxSeen = -1;
        int index = -1;
        

        for (int i = 0; i < groupSize; i++) {
            int outcome = outcomes[i];
            if (outcome > maxSeen && frequencyMap.get(outcome) == 1) {
                maxSeen = outcome;
               index = i;  
            }
            
        }

        if (index == -1) {
            System.out.println("none"); 
        } else {
            System.out.println(index + 1);  
        }
        
        sc.close();
    }
}