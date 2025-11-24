import java.util.*;
import java.security.SecureRandom;
public class CAI_Base{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  SecureRandom r=new SecureRandom();
  while(true){
   int x=r.nextInt(10)+1;
   int y=r.nextInt(10)+1;
   System.out.printf("How much is %d times %d?%n",x,y);
   while(s.nextInt()!=x*y)System.out.println("No. Please try again.");
   System.out.println("Very good!");
   System.out.println("Continue? 1=yes 0=no");
   if(s.nextInt()==0)break;
  }
 }
}
