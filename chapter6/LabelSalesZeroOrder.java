public class LabelSalesZeroOrder{
 public static void main(String[]a){
  int[][] sales=new int[3][5];
  int k=1;
  for(int row=0;row<sales.length;row++){
   for(int col=0;col<sales[row].length;col++){
    sales[row][col]=k++;
   }
  }
  for(int row=0;row<sales.length;row++){
   for(int col=0;col<sales[row].length;col++){
    System.out.print(sales[row][col]+" ");
   }
   System.out.println();
  }
 }
}
