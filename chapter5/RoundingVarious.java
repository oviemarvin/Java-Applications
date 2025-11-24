import java.util.*;
public class RoundingVarious{
 public static double roundToInteger(double x){return Math.floor(x+0.5);}
 public static double roundToTenths(double x){return Math.floor(x*10+0.5)/10.0;}
 public static double roundToHundredths(double x){return Math.floor(x*100+0.5)/100.0;}
 public static double roundToThousandths(double x){return Math.floor(x*1000+0.5)/1000.0;}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  while(s.hasNextDouble()){
   double x=s.nextDouble();
   System.out.printf("%f %f %f %f %f%n",x,roundToInteger(x),roundToTenths(x),roundToHundredths(x),roundToThousandths(x));
  }
 }
}
