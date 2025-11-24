import java.util.*;
import java.security.SecureRandom;
public class CAI_VaryResponses{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  SecureRandom r=new SecureRandom();
  while(true){
   int x=r.nextInt(10)+1,y=r.nextInt(10)+1;
   System.out.printf("How much is %d times %d?%n",x,y);
   while(true){
    int ans=s.nextInt();
    if(ans==x*y){
     switch(r.nextInt(4)){case 0: System.out.println("Very good!");break;case 1: System.out.println("Excellent!");break;case 2: System.out.println("Nice work!");break;default: System.out.println("Keep up the good work!");}
     break;
    } else {
     switch(r.nextInt(4)){case 0:System.out.println("No. Please try again.");break;case 1:System.out.println("Wrong. Try once more.");break;case 2:System.out.println("Don't give up! No.");break;default:System.out.println("Keep trying.");}
    }
   }
   System.out.println("Continue? 1=yes 0=no");
   if(s.nextInt()==0)break;
  }
 }
}
