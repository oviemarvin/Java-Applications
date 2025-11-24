import java.util.*;
public class SquareOfChar{
 public static void square(int side,char c){
  for(int i=0;i<side;i++){
   for(int j=0;j<side;j++)System.out.print(c);
   System.out.println();
  }
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  int side=s.nextInt();
  char c=s.next().charAt(0);
  square(side,c);
 }
}
