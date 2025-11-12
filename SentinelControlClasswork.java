import java.util.Scanner

/*write a java program to accept infite number from a user and 
calculate the count of positve numbers, negative numbers and zero
sentinel value 1*/


public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter numbers (enter +1 to stop):");

        while (true) {
            int number = input.nextInt();

            // Sentinel value check
            if (number == 1) {
                break;
            }

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("\n=== Results ===");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        input.close();
    }
}