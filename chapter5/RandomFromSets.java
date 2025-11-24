import java.util.*;
public class RandomFromSets{
 public static void main(String[]a){
  int[] s1={2,4,6,8,10};
  int[] s2={3,5,7,9,11};
  int[] s3={6,10,14,18,22};
  Random r=new Random();
  System.out.println(s1[r.nextInt(s1.length)]);
  System.out.println(s2[r.nextInt(s2.length)]);
  System.out.println(s3[r.nextInt(s3.length)]);
 }
}
