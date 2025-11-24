import java.util.*;
public class GuessNumberCount{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  Random r=new Random();
  int target=r.nextInt(1000)+1;
  int count=0;
  int guess=0;
  while(guess!=target){
   guess=s.nextInt(); count++;
   if(guess<target)System.out.println("Too low. Try again.");
   else if(guess>target)System.out.println("Too high. Try again.");
  }
  if(count<=10)System.out.println("Either you know the secret or you got lucky!");
  if(count==10)System.out.println("Aha! You know the secret!");
  if(count>10)System.out.println("You should be able to do better!");
 }
}
