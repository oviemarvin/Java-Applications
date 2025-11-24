import java.util.*;
public class RoundingNumbersFloor{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  while(s.hasNextDouble()){
   double x=s.nextDouble();
   long y=(long)Math.floor(x+0.5);
   System.out.printf("Original: %f Rounded: %d%n",x,y);
  }
 }
}
