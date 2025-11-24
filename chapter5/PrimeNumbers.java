public class PrimeNumbers{
 public static boolean isPrime(int n){
  if(n<2)return false;
  for(int i=2;i*i<=n;i++)if(n%i==0)return false;
  return true;
 }
 public static void main(String[]a){
  for(int i=2;i<10000;i++)if(isPrime(i))System.out.println(i);
 }
}
