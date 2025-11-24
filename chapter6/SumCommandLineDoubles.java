public class SumCommandLineDoubles{
 public static void main(String[]a){
  double sum=0;
  for(String s:a)sum+=Double.parseDouble(s);
  System.out.println(sum);
 }
}
