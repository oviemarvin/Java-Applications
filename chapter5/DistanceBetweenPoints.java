import java.util.*;
public class DistanceBetweenPoints{
 public static double distance(double x1,double y1,double x2,double y2){
  return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(distance(s.nextDouble(),s.nextDouble(),s.nextDouble(),s.nextDouble()));
 }
}
