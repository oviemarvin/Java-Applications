import java.util.*;
public class DuplicateElimination{
 public static void main(String[]a){
  Scanner s=new Scanner(System.in);
  int[] unique=new int[5];
  int count=0;
  for(int i=0;i<5;i++){
   int n=s.nextInt();
   boolean dup=false;
   for(int j=0;j<count;j++)if(unique[j]==n){dup=true;break;}
   if(!dup){unique[count++]=n;}
   for(int j=0;j<count;j++){
    System.out.print(unique[j]+" ");
   }
   System.out.println();
  }
 }
}
