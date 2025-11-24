import java.util.*;
public class IsEven{
 public static boolean isEven(int n){return n%2==0;}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  while(s.hasNextInt()){
   int n=s.nextInt();
   System.out.println(isEven(n)?"Even":"Odd");
  }
 }
}
