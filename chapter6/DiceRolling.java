import java.util.*;
public class DiceRolling{
 public static void main(String[]a){
  long rolls=36000000L;
  long[] tally=new long[13];
  Random r=new Random();
  for(long i=0;i<rolls;i++){
   int d1=r.nextInt(6)+1;
   int d2=r.nextInt(6)+1;
   tally[d1+d2]++;
  }
  System.out.println("Sum\tCount");
  for(int i=2;i<=12;i++)System.out.println(i+"\t"+tally[i]);
 }
}
