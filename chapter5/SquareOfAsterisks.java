import java.util.*;
public class SquareOfAsterisks{
 public static void squareOfAsterisks(int side){
  for(int i=0;i<side;i++){
   for(int j=0;j<side;j++)System.out.print("*");
   System.out.println();
  }
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  squareOfAsterisks(s.nextInt());
 }
}
