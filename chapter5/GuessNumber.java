import java.util.*;
public class GuessNumber{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  Random r=new Random();
  do{
   int target=r.nextInt(1000)+1;
   int guess=0;
   while(guess!=target){
    guess=s.nextInt();
    if(guess<target)System.out.println("Too low. Try again.");
    else if(guess>target)System.out.println("Too high. Try again.");
    else System.out.println("Congratulations. You guessed the number!");
   }
   System.out.println("Play again? 1=yes 0=no");
  }while(s.nextInt()==1);
 }
}
