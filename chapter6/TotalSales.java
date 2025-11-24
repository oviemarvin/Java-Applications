import java.util.*;
public class TotalSales{
 public static void main(String[]a){
  double[][] sales=new double[5][4];
  Scanner s=new Scanner(System.in);
  System.out.println("Enter sales slips (salesperson 1-4, product 1-5, amount). Enter 0 0 0 to finish.");
  while(true){
   int sp=s.nextInt();
   int pr=s.nextInt();
   double amt=s.nextDouble();
   if(sp==0 && pr==0 && amt==0)break;
   if(sp>=1 && sp<=4 && pr>=1 && pr<=5){
    sales[pr-1][sp-1]+=amt;
   }
  }
  System.out.print("Product\\Salesperson\t1\t2\t3\t4\tTotal\n");
  double[] colTotal=new double[4];
  for(int i=0;i<5;i++){
   double rowTotal=0;
   System.out.print((i+1)+"\t");
   for(int j=0;j<4;j++){
    System.out.print((int)sales[i][j]+"\t");
    rowTotal+=sales[i][j];
    colTotal[j]+=sales[i][j];
   }
   System.out.println((int)rowTotal);
  }
  System.out.print("Total\t");
  double grand=0;
  for(int j=0;j<4;j++){System.out.print((int)colTotal[j]+"\t");grand+=colTotal[j];}
  System.out.println((int)grand);
 }
}
