import java.util.*;
public class TemperatureConversion{
 public static int celsius(int f){return (int)Math.round(5.0/9.0*(f-32));}
 public static int fahrenheit(int c){return (int)Math.round(9.0/5.0*c+32);}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  int mode=s.nextInt();
  int val=s.nextInt();
  if(mode==1)System.out.println(celsius(val));
  else System.out.println(fahrenheit(val));
 }
}
