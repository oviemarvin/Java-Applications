import java.util.*;
import java.security.SecureRandom;
public class CAI_DifficultyAndTypes{
 public static int gen(SecureRandom r,int level){int max=(int)Math.pow(10,level); return r.nextInt(max);}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  SecureRandom r=new SecureRandom();
  int level=s.nextInt();
  int type=s.nextInt();
  while(true){
   int a1=gen(r,level), a2=gen(r,level);
   int ans=0;
   int op=type==5? (r.nextInt(4)+1):type;
   switch(op){
    case 1: System.out.printf("What is %d + %d?%n",a1,a2); ans=a1+a2; break;
    case 2: System.out.printf("What is %d - %d?%n",a1,a2); ans=a1-a2; break;
    case 3: System.out.printf("What is %d * %d?%n",a1,a2); ans=a1*a2; break;
    case 4: System.out.printf("What is %d / %d?%n",a1,a2); ans=(a2==0?0:a1/a2); break;
   }
   while(s.nextInt()!=ans)System.out.println("No. Please try again.");
   System.out.println("Continue? 1=yes 0=no");
   if(s.nextInt()==0)break;
  }
 }
}
