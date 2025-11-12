import java.util.Scanner;

public class SentinelControLLoop{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("Enter -1 to terminate the loop");
		while(true){
			System.out.print("Enter number: ");
			num = input.nextInt();
			
			sum += num;
			if (num== -1){
				break;
			}	
			sum += num;
			counter ++;
		}
		system.out printf("the total of the%d number (s) is %d%n", counter.sum);
	}
	
}

/*write a java program to accept infite number from a user and 
calculate the count of positve numbers, negative numbers and zero
sentinel value 1*/