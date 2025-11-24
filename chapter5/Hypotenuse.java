import java.util.*;
public class Hypotenuse{
 public static double hypotenuse(double a,double b){
  return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  while(s.hasNextDouble()){
   double x=s.nextDouble(), y=s.nextDouble();
   System.out.println(hypotenuse(x,y));
  }
 }
}
