import java.util.*;

public class ACapellaRecording {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        //sc.nextLine();
        List<Integer> notes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            notes.add(sc.nextInt());
            //Ssc.nextLine();
        }

        //System.out.println("This is the size of notes " + notes.size());
        Collections.sort(notes);
        int startPointer = 0;
        int groups = 0;

        for (int endPointer = 0; endPointer < notes.size(); endPointer++) {
            if (notes.get(endPointer) - notes.get(startPointer) > d) {
                groups ++;
                startPointer = endPointer;
            }
        }
        groups++;
        System.out.println(groups);

        sc.close();
    }
}