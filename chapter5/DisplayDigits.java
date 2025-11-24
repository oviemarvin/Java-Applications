import java.util.*;
public class DisplayDigits{
 public static int quotient(int a,int b){return a/b;}
 public static int remainder(int a,int b){return a%b;}
 public static void displayDigits(int n){
  int[] d=new int[5];
  for(int i=4;i>=0;i--){d[i]=n%10;n/=10;}
  boolean started=false;
  for(int v:d){
   if(!started && v==0) {System.out.print("  "); continue;}
   started=true;
   System.out.print(v+"  ");
  }
  System.out.println();
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  displayDigits(s.nextInt());
 }
}
