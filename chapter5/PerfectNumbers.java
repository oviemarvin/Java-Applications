public class PerfectNumbers{
 public static boolean isPerfect(int n){
  int sum=1;
  for(int i=2;i<=n/2;i++)if(n%i==0)sum+=i;
  return n>1 && sum==n;
 }
 public static void main(String[]a){
  for(int i=2;i<=1000;i++)if(isPerfect(i)){
   System.out.print(i+": ");
   for(int j=1;j<=i/2;j++)if(i%j==0)System.out.print(j+" ");
   System.out.println();
  }
 }
}
