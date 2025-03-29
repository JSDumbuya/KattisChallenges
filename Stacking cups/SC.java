import java.util.*;


public class SC {

    public static class Cup implements Comparable<Cup> {
        int rOrD;
        String color;

        public Cup (int rOrD, String color) {
            this.rOrD = rOrD;
            this.color = color;
        }

        @Override
        public int compareTo(Cup other) {
            return Integer.compare(this.rOrD, other.rOrD);
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfCups = sc.nextInt();
        sc.nextLine();

        ArrayList<Cup> cups = new ArrayList<>();


        for (int i = 0; i < numberOfCups; i++) {
            String[] input = sc.nextLine().split(" ");

            try {
                //Radius før farve - divider med 2 for at få radius vs. diameter.
                int rOD = Integer.parseInt(input[0])/2;

                Cup cup = new Cup(rOD, input[1]);

                cups.add(cup);

            } catch (Exception e) {
                //farve før radius.

                int rOD = Integer.parseInt(input[1]);

                Cup cup = new Cup(rOD, input[0]);

                cups.add(cup);
            }
        }

        Collections.sort(cups);

        for (Cup cup : cups) {
            System.out.println(cup.color);
        }

        sc.close();
    }
}