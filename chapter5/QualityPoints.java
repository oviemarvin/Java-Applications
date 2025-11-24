import java.util.*;
public class QualityPoints{
 public static int qualityPoints(int avg){
  if(avg>=90) return 4;
  if(avg>=80) return 3;
  if(avg>=70) return 2;
  if(avg>=60) return 1;
  return 0;
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  System.out.println(qualityPoints(s.nextInt()));
 }
}
