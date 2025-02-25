import java.util.*;

public class CD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] secretString = sc.nextLine().split("");
        int cases = sc.nextInt();
        sc.nextLine();
        Map<Character, Integer> letterToNumberMap = new HashMap<>();
        Map<Integer, Character> numberToLetterMap = new HashMap<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            letterToNumberMap.put(i, i - 'A');
            numberToLetterMap.put(i - 'A', i);
        }

        for (int i = 0; i < cases; i++) {
            String messageToEncode = sc.nextLine();
            String encodedMessage = "";
            for (int j = 0; j < messageToEncode.length(); j++) {
                int mask = letterToNumberMap.get(messageToEncode.charAt(j)) * Integer.parseInt(secretString[j]);
                encodedMessage+= numberToLetterMap.get(mask % 26);
            }
            System.out.println(encodedMessage);
        }

        sc.close();
    }
}