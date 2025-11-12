import java.util.Scanner;

/*write a java program to accept infite number from a user and 
calculate the count of positve numbers, negative numbers and zero
sentinel value 1*/


public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
		System.out.println("Enter +1 to terminate the loop");

        while (true) {
			System.out.println("Enter numbers:");
            int number = input.nextInt();
			
			sum += number;
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

        System.out.println("Result");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

    }
}