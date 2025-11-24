import java.util.Scanner;
public class SalesCommissions{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  int[] ranges=new int[9];
  while(true){
   System.out.println("Enter gross sales (negative to finish):");
   double gross=s.nextDouble();
   if(gross<0)break;
   int salary=(int)(200+0.09*gross);
   int index= (salary>=1000)?8: (salary/100)-2;
   if(index<0)index=0;
   if(index>8)index=8;
   ranges[index]++;
  }
  System.out.println("Range\tCount");
  String[] labels={"$200-299","$300-399","$400-499","$500-599","$600-699","$700-799","$800-899","$900-999","$1000 and over"};
  for(int i=0;i<ranges.length;i++)System.out.printf("%s\t%d%n",labels[i],ranges[i]);
 }
}