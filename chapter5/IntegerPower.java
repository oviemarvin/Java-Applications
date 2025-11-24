import java.util.*;
public class IntegerPower{
 public static long integerPower(int base,int exp){
  long p=1;
  for(int i=0;i<exp;i++)p*=base;
  return p;
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  int b=s.nextInt(), e=s.nextInt();
  System.out.println(integerPower(b,e));
 }
}
