import java.util.*;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] cardsPlayed = input.toCharArray();

        int ts = 0;
        int cs = 0;
        int gs = 0;
        int score = 0;
        
        for (int i = 0; i < cardsPlayed.length; i++) {
            switch (cardsPlayed[i]) {
                case 'T':
                    ts ++;
                    break;
                case 'G':
                    gs ++;
                    break;
                case 'C':
                    cs ++;
                    break;
            }
        }
        
        int amountOfThreeDifCards = Math.min(Math.min(gs, ts), cs) * 7;
        score += Math.pow(ts, 2) + Math.pow(gs, 2) + Math.pow(cs, 2) + amountOfThreeDifCards;

        System.out.println(score);

        sc.close();
    }

}