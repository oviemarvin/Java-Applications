import java.util.*;
public class CircleArea{
 public static double circleArea(double r){return Math.PI*r*r;}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(circleArea(s.nextDouble()));
 }
}
