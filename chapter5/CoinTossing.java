import java.util.*;
public class CoinTossing{
 enum Coin{HEADS,TAILS}
 public static Coin flip(Random r){return r.nextBoolean()?Coin.HEADS:Coin.TAILS;}
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  Random r=new Random();
  int heads=0,tails=0;
  while(true){
   String cmd=s.next();
   if(cmd.equalsIgnoreCase("quit"))break;
   Coin c=flip(r);
   if(c==Coin.HEADS)heads++; else tails++;
   System.out.println(c);
  }
  System.out.println("Heads: "+heads+" Tails: "+tails);
 }
}
