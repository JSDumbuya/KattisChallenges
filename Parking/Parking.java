import java.util.*;

public class Parking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tempPrices = sc.nextLine().split(" ");

        int A = Integer.parseInt(tempPrices[0]);
        int B = Integer.parseInt(tempPrices[1]);
        int C = Integer.parseInt(tempPrices[2]);

        int[] prices = new int[]{A, B, C};


        ArrayList<Integer> arrivalTimes = new ArrayList<>();
        ArrayList<Integer> departureTimes = new ArrayList<>();
        HashMap<Integer, Integer> payment = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            String[] tempTimes = sc.nextLine().split(" ");
            
            payment.put(i, 0);
            
            arrivalTimes.add(Integer.parseInt(tempTimes[0]));
            departureTimes.add(Integer.parseInt(tempTimes[1]));
        }

        sc.close();


        int minInterval = Collections.min(arrivalTimes);
        int maxInterval = Collections.max(departureTimes);

        int arrivals = 0;


        for (int i = minInterval; i < maxInterval; i++) {

            arrivals = 0;

            for (int j = 0; j < 3; j++) {
                 //A car has arrived at the lot, increase arrivals.
                if (arrivalTimes.get(j) <= i && departureTimes.get(j) > i) {
                    arrivals++;
                    //System.out.println( j + " has arrived at : " + i + " the total number of cars is now: " + arrivals);
                } 
            }

            for (int j = 0; j < 3; j++) {
                  //The car is at the lot, update the price.
                if (arrivalTimes.get(j) <= i && departureTimes.get(j) > i) {
                    int updatedPay = payment.get(j) + prices[arrivals - 1];
                    //System.out.println("The price for car: " + j + " is " + prices[arrivals - 1] + " at " + i);
                    payment.put(j, updatedPay);
                } 
            }
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> car : payment.entrySet()) {
            sum += car.getValue();
        }

        System.out.println(sum);

    }
}