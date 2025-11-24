public class ProductVarargs{
 public static long product(int... nums){
  long p=1;
  for(int n:nums)p*=n;
  return p;
 }
 public static void main(String[]a){
  System.out.println(product(2,3,4));
  System.out.println(product(5,6));
  System.out.println(product(7));
 }
}
