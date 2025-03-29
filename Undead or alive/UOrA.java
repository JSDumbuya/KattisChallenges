import java.util.*;

public class UOrA {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(readInput(input));

        sc.close();


    }

    public static String readInput(String input) {

        boolean hasFrowny = input.contains( ":(");
        boolean hasSmiley = input.contains( ":)");
        

        if (input.contains("::)") || input.contains("::(") || hasSmiley && hasFrowny ) {
            return "double agent";
        } else if (hasSmiley) {
            return "alive";
        } else if (hasFrowny) {
            return "undead";
        } else return "machine";
    }
}