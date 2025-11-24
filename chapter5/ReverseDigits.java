import java.util.*;
public class ReverseDigits{
 public static int reverse(int n){
  int r=0;
  while(n!=0){r=r*10+n%10;n/=10;}
  return r;
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(reverse(s.nextInt()));
 }
}
