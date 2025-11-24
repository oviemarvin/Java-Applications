import java.util.*;
import java.security.SecureRandom;
public class CAI_PerformanceMonitor{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  SecureRandom r=new SecureRandom();
  while(true){
   int correct=0, total=0;
   while(total<10){
    int x=r.nextInt(10)+1,y=r.nextInt(10)+1;
    System.out.printf("How much is %d times %d?%n",x,y);
    if(s.nextInt()==x*y)correct++;
    total++;
   }
   int pct=correct*10;
   if(pct<75)System.out.println("Please ask your teacher for extra help.");
   else System.out.println("Congratulations, you are ready to go to the next level!");
   System.out.println("Restart? 1=yes 0=no");
   if(s.nextInt()==0)break;
  }
 }
}
