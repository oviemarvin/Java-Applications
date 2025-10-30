public class OperatorsPart2{
	public static void main(String [] args){
	
		int num1 = 15;
		int num2 = 25;
		int num3 = 17;
			boolean result = (num1 > num2) && (num1 > num3);
			System.out.printf("The result is %b%n", result);


		//AND logical operator
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n", result);
		
		
		//OR logical operator
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n", result2);
		
		
		//NOT logical operator
		boolean  result3 =! ((num1 > num2) && (num1 > num3));
		System.out.printf("The result is %b%n", result3);
	
	
		//Pre-increment unary operator
		
		int num4 = 10;
		num4++;
		System.out.println("%d%n", num4);
		System.out.printf("%d%n", ++num4);
		
		//Post-increment unary operator
		int num5 = 10;
		num4++;
		System.out.println("%d%n", num5);
		System.out.printf("%d%n" , num5++);
		
		
		
		
		//Pre-decrement unary operator
		
		System.out.println("%d%n", num4);
		System.out.printf("%d%n", --num4);
		
		//Post-decrementcrement unary operator
		
		System.out.println("%d%n", num5);
		System.out.printf("%d%n" , num5--);
		System.out.println("%d%n", num5);
		
		
		
		
		
		
	
	
	
	
	}
		


}