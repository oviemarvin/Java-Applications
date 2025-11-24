import java.util.*;
public class Minimum3{
 public static double minimum3(double a,double b,double c){
  return Math.min(a,Math.min(b,c));
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(minimum3(s.nextDouble(),s.nextDouble(),s.nextDouble()));
 }
}
