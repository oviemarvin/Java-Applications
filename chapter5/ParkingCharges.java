import java.util.*;
public class ParkingCharges{
 public static double calculateCharges(double hours){
  double charge=2.0;
  if(hours>3){
   double extra=Math.ceil(hours-3);
   charge+=0.5*extra;
  }
  if(charge>10)charge=10.0;
  return charge;
 }
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  double total=0;
  while(true){
   double h=s.nextDouble();
   if(h<0)break;
   double c=calculateCharges(h);
   System.out.printf("Charge: %.2f%n",c);
   total+=c;
  }
  System.out.printf("Total receipts: %.2f%n",total);
 }
}
