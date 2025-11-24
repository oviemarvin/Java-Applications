import java.util.*;
public class IsMultiple{
 public static boolean isMultiple(int a,int b){return b%a==0;}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  while(s.hasNextInt()){
   int x=s.nextInt(), y=s.nextInt();
   System.out.println(isMultiple(x,y));
  }
 }
}
