import java.util.*;
public class GCD{
 public static int gcd(int a,int b){
  while(b!=0){int t=b;b=a%b;a=t;}
  return Math.abs(a);
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(gcd(s.nextInt(),s.nextInt()));
 }
}
